package net.mattias.pedestals.block.custom.wool;

import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.block.entity.custom.wool.LimeWoolPedestalBlockEntity;
import net.mattias.pedestals.screen.custom.wool.menu.LimeWoolPedestalMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;

public class LimeWoolPedestalBlock extends BaseEntityBlock {
    public static final VoxelShape SHAPE = Block.box(2, 0, 2, 14, 13, 14);

    public LimeWoolPedestalBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (blockState.getBlock() == ModBlocks.LIME_WOOL_PEDESTAL.get()) {
            return new LimeWoolPedestalBlockEntity(blockPos, blockState);
        }
        return new LimeWoolPedestalBlockEntity(blockPos, blockState);
    }


    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pMovedByPiston) {
        if (pState.getBlock() != pNewState.getBlock()) {
            if (pLevel.getBlockEntity(pPos) instanceof LimeWoolPedestalBlockEntity limeWoolPedestalBlockEntity) {
                Containers.dropContents(pLevel, pPos, limeWoolPedestalBlockEntity);
                pLevel.updateNeighbourForOutputSignal(pPos, this);
            }
            super.onRemove(pState, pLevel, pPos, pNewState, pMovedByPiston);
        }
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHitResult) {
        if (pLevel.getBlockEntity(pPos) instanceof LimeWoolPedestalBlockEntity limeWoolPedestalBlockEntity) {
            ItemStack stackInHand = pPlayer.getItemInHand(pHand);

            if (pPlayer.isCrouching() && !pLevel.isClientSide()) {
                if (pPlayer instanceof ServerPlayer serverPlayer) {
                    NetworkHooks.openScreen(serverPlayer, new SimpleMenuProvider(
                            (id, inventory, player) -> new LimeWoolPedestalMenu(id, inventory, limeWoolPedestalBlockEntity),
                            Component.literal("Lime Wool Pedestal")
                    ), pPos);
                }
                return InteractionResult.SUCCESS;
            }

            if (limeWoolPedestalBlockEntity.isEmpty() && !stackInHand.isEmpty()) {
                limeWoolPedestalBlockEntity.setItem(0, stackInHand.split(1));
                pLevel.playSound(null, pPos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1.5f);
            } else if (!limeWoolPedestalBlockEntity.isEmpty() && stackInHand.isEmpty()) {
                pPlayer.setItemInHand(pHand, limeWoolPedestalBlockEntity.getItem(0).copy());
                limeWoolPedestalBlockEntity.clearContent();
                pLevel.playSound(null, pPos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1f);
            }

            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

}
