package net.mattias.pedestals.core.world.inventory;

import net.mattias.pedestals.core.registry.ModMenus;
import net.mattias.pedestals.core.world.block.PedestalBlock;
import net.mattias.pedestals.core.world.block.entity.PedestalBlockEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.Nullable;

public class PedestalMenu extends AbstractContainerMenu {

    public PedestalMenu(int containerID, Inventory playerInventory, FriendlyByteBuf extraData) {
        this(containerID, playerInventory, (PedestalBlockEntity) playerInventory.player.level().getBlockEntity(extraData.readBlockPos()));
    }

    private final Container container;

    public PedestalMenu(int containerID, Inventory playerInventory, PedestalBlockEntity pedestal) {
        super(ModMenus.PEDESTAL.get(), containerID);

        checkContainerSize(pedestal, 1);
        this.container = pedestal;

        pedestal.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(iItemHandler -> {
            pedestal.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(itemHandler -> {
                this.addSlot(new SlotItemHandler(itemHandler, 0, 80, 35));
            });
        });

        /// PLAYER INVENTORY SLOTS
        for(int row = 0; row < 3; ++row) {
            for(int column = 0; column < 9; ++column) {
                this.addSlot(new Slot(playerInventory, column + row * 9 + 9, 8 + column * 18, 84 + row * 18));
            }
        }
        for(int column = 0; column < 9; ++column) {
            this.addSlot(new Slot(playerInventory, column, 8 + column * 18, 142));
        }
    }

    @Override
    public ItemStack quickMoveStack(Player pPlayer, int pIndex) {

        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(pIndex);
        if (!slot.hasItem()) return newStack;

        ItemStack originalStack = slot.getItem();
        newStack = originalStack.copy();

        final boolean itemMovedToPlayer = pIndex < this.container.getContainerSize();
        if (itemMovedToPlayer) {
            if (!this.moveItemStackTo(originalStack, this.container.getContainerSize(), this.slots.size(), true)) {
                return ItemStack.EMPTY;
            }
        }
        else if (!this.moveItemStackTo(originalStack, 0, this.container.getContainerSize(), false)) {
            return ItemStack.EMPTY;
        }

        if (originalStack.isEmpty()) {
            slot.setByPlayer(ItemStack.EMPTY);
        }
        else {
            slot.setChanged();
        }

        return newStack;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return this.container.stillValid(pPlayer);
    }
}
