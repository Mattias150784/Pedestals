package net.mattias.pedestals.core.world.block.entity;

import net.mattias.pedestals.core.registry.ModBlockEntities;
import net.mattias.pedestals.core.world.inventory.PedestalMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

public class PedestalBlockEntity extends BaseContainerBlockEntity {

    public PedestalBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.PEDESTAL.get(), pPos, pBlockState);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("block.pedestals.pedestal");
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.pedestals.pedestal");
    }

    @Override
    protected AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory) {
        return new PedestalMenu(pContainerId, pInventory, this);
    }

    private float rotation = 0;
    public float getRenderingRotation() {
        this.rotation += 0.5f;
        if (this.rotation >= 360) {
            this.rotation = 0;
        }
        return this.rotation;
    }

    /// /// CONTAINER METHODS \\\ \\\

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private final ItemStackHandler inventory = new ItemStackHandler(1) {

        @Override
        protected int getStackLimit(int slot, @NotNull ItemStack stack) {
            return 1;
        }

        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            if (PedestalBlockEntity.this.level != null && !PedestalBlockEntity.this.level.isClientSide()) {
                PedestalBlockEntity.this.level.sendBlockUpdated(getBlockPos(), PedestalBlockEntity.this.getBlockState(), PedestalBlockEntity.this.getBlockState(), 3);
            }
        }
    };

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        super.saveAdditional(pTag);
        pTag.put("inventory", inventory.serializeNBT());
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        inventory.deserializeNBT(pTag.getCompound("inventory"));
    }

    @Override
    public int getContainerSize() {
        return this.inventory.getSlots();
    }

    @Override
    public boolean isEmpty() {

        for (int i = 0; i < this.getContainerSize(); i++) {
            if (!this.inventory.getStackInSlot(i).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack getItem(int i) {
        return inventory.getStackInSlot(i);
    }

    @Override
    public ItemStack removeItem(int i, int amount) {
        return inventory.extractItem(i, amount, false);
        // return ContainerHelper.removeItem((List<ItemStack>) inventory, i, amount);
    }

    @Override
    public ItemStack removeItemNoUpdate(int pSlot) {
        return inventory.getStackInSlot(pSlot);
    }

    @Override
    public void setItem(int pSlot, ItemStack pStack) {
        inventory.setStackInSlot(pSlot, pStack);
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return Container.stillValidBlockEntity(this, pPlayer);
    }

    @Override
    public void clearContent() {
        for (int i = 0; i < getContainerSize(); i++) {
            inventory.setStackInSlot(i, ItemStack.EMPTY);
        }
    }

    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag() {
        return saveWithoutMetadata();
    }

    @Override
    public void onLoad() {
        super.onLoad();
        this.lazyItemHandler = LazyOptional.of(() -> this.inventory);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        this.lazyItemHandler.invalidate();
    }

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return this.lazyItemHandler.cast();
        }
        return super.getCapability(cap, side);
    }
}