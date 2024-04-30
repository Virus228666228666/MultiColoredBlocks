package ru.V5Minecraft.MultiColoredBlocks.TileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;
import ru.V5Minecraft.MultiColoredBlocks.blocks.*;

import javax.annotation.Nullable;
import java.util.Iterator;

public class OrangeFurnaceTileEntity extends TileEntityLockable implements ITickable, ISidedInventory {
    private static final int[] SLOTS_TOP = new int[]{0};
    private static final int[] SLOTS_BOTTOM = new int[]{2, 1};
    private static final int[] SLOTS_SIDES = new int[]{1};
    private NonNullList<ItemStack> furnaceItemStacks;
    private int furnaceBurnTime;
    private int currentItemBurnTime;
    private int cookTime;
    private int totalCookTime;
    private String furnaceCustomName;
    IItemHandler handlerTop;
    IItemHandler handlerBottom;
    IItemHandler handlerSide;

    public OrangeFurnaceTileEntity() {
        this.furnaceItemStacks = NonNullList.withSize(3, ItemStack.EMPTY);
        this.handlerTop = new SidedInvWrapper(this, EnumFacing.UP);
        this.handlerBottom = new SidedInvWrapper(this, EnumFacing.DOWN);
        this.handlerSide = new SidedInvWrapper(this, EnumFacing.WEST);
    }

    public int getSizeInventory() {
        return this.furnaceItemStacks.size();
    }

    public boolean isEmpty() {
        Iterator var1 = this.furnaceItemStacks.iterator();

        ItemStack itemstack;
        do {
            if (!var1.hasNext()) {
                return true;
            }

            itemstack = (ItemStack)var1.next();
        } while(itemstack.isEmpty());

        return false;
    }

    public ItemStack getStackInSlot(int p_70301_1_) {
        return this.furnaceItemStacks.get(p_70301_1_);
    }

    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
        return ItemStackHelper.getAndSplit(this.furnaceItemStacks, p_70298_1_, p_70298_2_);
    }

    public ItemStack removeStackFromSlot(int p_70304_1_) {
        return ItemStackHelper.getAndRemove(this.furnaceItemStacks, p_70304_1_);
    }

    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
        ItemStack itemstack = this.furnaceItemStacks.get(p_70299_1_);
        boolean flag = !p_70299_2_.isEmpty() && p_70299_2_.isItemEqual(itemstack) && ItemStack.areItemStackTagsEqual(p_70299_2_, itemstack);
        this.furnaceItemStacks.set(p_70299_1_, p_70299_2_);
        if (p_70299_2_.getCount() > this.getInventoryStackLimit()) {
            p_70299_2_.setCount(this.getInventoryStackLimit());
        }

        if (p_70299_1_ == 0 && !flag) {
            this.totalCookTime = this.getCookTime(p_70299_2_);
            this.cookTime = 0;
            this.markDirty();
        }

    }

    public String getName() {
        return this.hasCustomName() ? this.furnaceCustomName : "container.furnace";
    }

    public boolean hasCustomName() {
        return this.furnaceCustomName != null && !this.furnaceCustomName.isEmpty();
    }

    public void setCustomInventoryName(String p_145951_1_) {
        this.furnaceCustomName = p_145951_1_;
    }

    public void readFromNBT(NBTTagCompound p_145839_1_) {
        super.readFromNBT(p_145839_1_);
        this.furnaceItemStacks = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
        ItemStackHelper.loadAllItems(p_145839_1_, this.furnaceItemStacks);
        this.furnaceBurnTime = p_145839_1_.getInteger("BurnTime");
        this.cookTime = p_145839_1_.getInteger("CookTime");
        this.totalCookTime = p_145839_1_.getInteger("CookTimeTotal");
        this.currentItemBurnTime = getItemBurnTime(this.furnaceItemStacks.get(1));
        if (p_145839_1_.hasKey("CustomName", 8)) {
            this.furnaceCustomName = p_145839_1_.getString("CustomName");
        }

    }

    public NBTTagCompound writeToNBT(NBTTagCompound p_189515_1_) {
        super.writeToNBT(p_189515_1_);
        p_189515_1_.setInteger("BurnTime", (short)this.furnaceBurnTime);
        p_189515_1_.setInteger("CookTime", (short)this.cookTime);
        p_189515_1_.setInteger("CookTimeTotal", (short)this.totalCookTime);
        ItemStackHelper.saveAllItems(p_189515_1_, this.furnaceItemStacks);
        if (this.hasCustomName()) {
            p_189515_1_.setString("CustomName", this.furnaceCustomName);
        }

        return p_189515_1_;
    }

    public int getInventoryStackLimit() {
        return 64;
    }

    public boolean isBurning() {
        return this.furnaceBurnTime > 0;
    }

    @SideOnly(Side.CLIENT)
    public static boolean isBurning(IInventory p_174903_0_) {
        return p_174903_0_.getField(0) > 0;
    }

    public void update() {
        boolean flag = this.isBurning();
        boolean flag1 = false;
        if (this.isBurning()) {
            --this.furnaceBurnTime;
        }

        if (!this.world.isRemote) {
            ItemStack itemstack = (ItemStack) this.furnaceItemStacks.get(1);
            if (this.isBurning() || !itemstack.isEmpty() && !((ItemStack) this.furnaceItemStacks.get(0)).isEmpty()) {
                if (!this.isBurning() && this.canSmelt()) {
                    this.furnaceBurnTime = getItemBurnTime(itemstack);
                    this.currentItemBurnTime = this.furnaceBurnTime;
                    if (this.isBurning()) {
                        flag1 = true;
                        if (!itemstack.isEmpty()) {
                            Item item = itemstack.getItem();
                            itemstack.shrink(1);
                            if (itemstack.isEmpty()) {
                                ItemStack item1 = item.getContainerItem(itemstack);
                                this.furnaceItemStacks.set(1, item1);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt()) {
                    ++this.cookTime;
                    if (this.cookTime == this.totalCookTime) {
                        this.cookTime = 0;
                        this.totalCookTime = this.getCookTime((ItemStack) this.furnaceItemStacks.get(0));
                        this.smeltItem();
                        flag1 = true;
                    }
                } else {
                    this.cookTime = 0;
                }
            } else if (!this.isBurning() && this.cookTime > 0) {
                this.cookTime = MathHelper.clamp(this.cookTime - 2, 0, this.totalCookTime);
            }

            if (flag != this.isBurning()) {
                flag1 = true;
                OrangeFurnace.setState(this.isBurning(), this.world, this.pos);
            }
        }

        if (flag1) {
            this.markDirty();
        }
    }

    public int getCookTime(ItemStack p_174904_1_) {
        return 200;
    }

    private boolean canSmelt() {
        if ((this.furnaceItemStacks.get(0)).isEmpty()) {
            return false;
        } else {
            ItemStack itemstack = FurnaceRecipes.instance().getSmeltingResult(this.furnaceItemStacks.get(0));
            if (itemstack.isEmpty()) {
                return false;
            } else {
                ItemStack itemstack1 = this.furnaceItemStacks.get(2);
                if (itemstack1.isEmpty()) {
                    return true;
                } else if (!itemstack1.isItemEqual(itemstack)) {
                    return false;
                } else if (itemstack1.getCount() + itemstack.getCount() <= this.getInventoryStackLimit() && itemstack1.getCount() + itemstack.getCount() <= itemstack1.getMaxStackSize()) {
                    return true;
                } else {
                    return itemstack1.getCount() + itemstack.getCount() <= itemstack.getMaxStackSize();
                }
            }
        }
    }

    public void smeltItem() {
        if (this.canSmelt()) {
            ItemStack itemstack = this.furnaceItemStacks.get(0);
            ItemStack itemstack1 = FurnaceRecipes.instance().getSmeltingResult(itemstack);
            ItemStack itemstack2 = this.furnaceItemStacks.get(2);
            if (itemstack2.isEmpty()) {
                this.furnaceItemStacks.set(2, itemstack1.copy());
            } else if (itemstack2.getItem() == itemstack1.getItem()) {
                itemstack2.grow(itemstack1.getCount());
            }

            if (itemstack.getItem() == Item.getItemFromBlock(Blocks.SPONGE) && itemstack.getMetadata() == 1 && !(this.furnaceItemStacks.get(1)).isEmpty() && (this.furnaceItemStacks.get(1)).getItem() == Items.BUCKET) {
                this.furnaceItemStacks.set(1, new ItemStack(Items.WATER_BUCKET));
            }

            itemstack.shrink(1);
        }

    }

    public static int getItemBurnTime(ItemStack p_145952_0_) {
        if (p_145952_0_.isEmpty()) {
            return 0;
        } else {
            int burnTime = ForgeEventFactory.getItemBurnTime(p_145952_0_);
            if (burnTime >= 0) {
                return burnTime;
            } else {
                Item item = p_145952_0_.getItem();
                if (item == Item.getItemFromBlock(Blocks.WOODEN_SLAB)) {
                    return 150;
                } else if (item == Item.getItemFromBlock(Blocks.WOOL)) {
                    return 100;
                } else if (item == Item.getItemFromBlock(Blocks.CARPET)) {
                    return 67;
                } else if (item == Item.getItemFromBlock(Blocks.LADDER)) {
                    return 300;
                } else if (item == Item.getItemFromBlock(Blocks.WOODEN_BUTTON)) {
                    return 100;
                } else if (Block.getBlockFromItem(item).getDefaultState().getMaterial() == Material.WOOD) {
                    return 300;
                } else if (item == Item.getItemFromBlock(Blocks.COAL_BLOCK)) {
                    return 16000;
                } else if (item instanceof ItemTool && "WOOD".equals(((ItemTool)item).getToolMaterialName())) {
                    return 200;
                } else if (item instanceof ItemSword && "WOOD".equals(((ItemSword)item).getToolMaterialName())) {
                    return 200;
                } else if (item instanceof ItemHoe && "WOOD".equals(((ItemHoe)item).getMaterialName())) {
                    return 200;
                } else if (item == Items.STICK) {
                    return 100;
                } else if (item != Items.BOW && item != Items.FISHING_ROD) {
                    if (item == Items.SIGN) {
                        return 200;
                    } else if (item == Items.COAL) {
                        return 1600;
                    } else if (item == Items.LAVA_BUCKET) {
                        return 20000;
                    } else if (item != Item.getItemFromBlock(Blocks.SAPLING) && item != Items.BOWL) {
                        if (item == Items.BLAZE_ROD) {
                            return 2400;
                        } else if (item instanceof ItemDoor && item != Items.IRON_DOOR) {
                            return 200;
                        } else {
                            return item instanceof ItemBoat ? 400 : 0;
                        }
                    } else {
                        return 100;
                    }
                } else {
                    return 300;
                }
            }
        }
    }

    public static boolean isItemFuel(ItemStack p_145954_0_) {
        return getItemBurnTime(p_145954_0_) > 0;
    }

    public boolean isUsableByPlayer(EntityPlayer p_70300_1_) {
        if (this.world.getTileEntity(this.pos) != this) {
            return false;
        } else {
            return p_70300_1_.getDistanceSq((double)this.pos.getX() + 0.5, (double)this.pos.getY() + 0.5, (double)this.pos.getZ() + 0.5) <= 64.0;
        }
    }

    public void openInventory(EntityPlayer p_174889_1_) {
    }

    public void closeInventory(EntityPlayer p_174886_1_) {
    }

    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        if (p_94041_1_ == 2) {
            return false;
        } else if (p_94041_1_ != 1) {
            return true;
        } else {
            ItemStack itemstack = this.furnaceItemStacks.get(1);
            return isItemFuel(p_94041_2_) || SlotFurnaceFuel.isBucket(p_94041_2_) && itemstack.getItem() != Items.BUCKET;
        }
    }

    public int[] getSlotsForFace(EnumFacing p_180463_1_) {
        if (p_180463_1_ == EnumFacing.DOWN) {
            return SLOTS_BOTTOM;
        } else {
            return p_180463_1_ == EnumFacing.UP ? SLOTS_TOP : SLOTS_SIDES;
        }
    }

    public boolean canInsertItem(int p_180462_1_, ItemStack p_180462_2_, EnumFacing p_180462_3_) {
        return this.isItemValidForSlot(p_180462_1_, p_180462_2_);
    }

    public boolean canExtractItem(int p_180461_1_, ItemStack p_180461_2_, EnumFacing p_180461_3_) {
        if (p_180461_3_ == EnumFacing.DOWN && p_180461_1_ == 1) {
            Item item = p_180461_2_.getItem();
            if (item != Items.WATER_BUCKET && item != Items.BUCKET) {
                return false;
            }
        }

        return true;
    }

    public String getGuiID() {
        return "minecraft:furnace";
    }

    public Container createContainer(InventoryPlayer p_174876_1_, EntityPlayer p_174876_2_) {
        return new ContainerFurnace(p_174876_1_, this);
    }

    public int getField(int p_174887_1_) {
        switch (p_174887_1_) {
            case 0:
                return this.furnaceBurnTime;
            case 1:
                return this.currentItemBurnTime;
            case 2:
                return this.cookTime;
            case 3:
                return this.totalCookTime;
            default:
                return 0;
        }
    }

    public void setField(int p_174885_1_, int p_174885_2_) {
        switch (p_174885_1_) {
            case 0:
                this.furnaceBurnTime = p_174885_2_;
                break;
            case 1:
                this.currentItemBurnTime = p_174885_2_;
                break;
            case 2:
                this.cookTime = p_174885_2_;
                break;
            case 3:
                this.totalCookTime = p_174885_2_;
        }

    }

    public int getFieldCount() {
        return 4;
    }

    public void clear() {
        this.furnaceItemStacks.clear();
    }

    @Nullable
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        if (facing != null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (facing == EnumFacing.DOWN)
                return (T)this.handlerBottom;
            if (facing == EnumFacing.UP)
                return (T)this.handlerTop;
            return (T)this.handlerSide;
        }
        return (T)super.getCapability(capability, facing);
    }
}
