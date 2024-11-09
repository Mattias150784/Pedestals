package net.mattias.pedestals.block.custom.planks;

import com.mojang.serialization.MapCodec;
import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.block.entity.custom.planks.MangrovePlanksPedestalBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.*;
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

public class MangrovePlanksPedestalBlock extends BaseEntityBlock {
    public static final VoxelShape SHAPE = Block.box(2, 0, 2, 14, 13, 14);
    public static final MapCodec<MangrovePlanksPedestalBlock> CODEC = simpleCodec(MangrovePlanksPedestalBlock::new);
    public MangrovePlanksPedestalBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (blockState.getBlock() == ModBlocks.MANGROVE_PLANKS_PEDESTAL.get()) {
            return new MangrovePlanksPedestalBlockEntity(blockPos, blockState);
        }
        return new MangrovePlanksPedestalBlockEntity(blockPos, blockState);
    }


    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pMovedByPiston) {
        if (pState.getBlock() != pNewState.getBlock()) {
            if (pLevel.getBlockEntity(pPos) instanceof MangrovePlanksPedestalBlockEntity mangrovePlanksPedestalBlockEntity) {
                Containers.dropContents(pLevel, pPos, mangrovePlanksPedestalBlockEntity);
                pLevel.updateNeighbourForOutputSignal(pPos, this);
            }
            super.onRemove(pState, pLevel, pPos, pNewState, pMovedByPiston);
        }
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack pStack, BlockState pState, Level pLevel, BlockPos pPos,
                                              Player pPlayer, InteractionHand pHand, BlockHitResult pHitResult) {
        if(pLevel.getBlockEntity(pPos) instanceof MangrovePlanksPedestalBlockEntity mangrovePlanksPedestalBlockEntity) {
            if(pPlayer.isCrouching() && !pLevel.isClientSide()) {
                ((ServerPlayer) pPlayer).openMenu(new SimpleMenuProvider(mangrovePlanksPedestalBlockEntity, Component.literal("Pedestal")), pPos);
                return ItemInteractionResult.SUCCESS;
            }

            if(mangrovePlanksPedestalBlockEntity.isEmpty() && !pStack.isEmpty()) {
                mangrovePlanksPedestalBlockEntity.setItem(0, pStack);
                pStack.shrink(1);
                pLevel.playSound(pPlayer, pPos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 2f);
            } else if(pStack.isEmpty()) {
                ItemStack stackOnPedestal = mangrovePlanksPedestalBlockEntity.getItem(0);
                pPlayer.setItemInHand(InteractionHand.MAIN_HAND, stackOnPedestal);
                mangrovePlanksPedestalBlockEntity.clearContent();
                pLevel.playSound(pPlayer, pPos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1f);
            }
        }

        return ItemInteractionResult.SUCCESS;
    }

}
