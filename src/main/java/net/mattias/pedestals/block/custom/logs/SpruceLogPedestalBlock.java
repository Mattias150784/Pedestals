package net.mattias.pedestals.block.custom.logs;

import net.mattias.pedestals.block.ModBlocks;
import net.mattias.pedestals.block.entity.custom.logs.SpruceLogPedestalBlockEntity;
import net.mattias.pedestals.screen.custom.logs.menu.SpruceLogPedestalMenu;
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

public class SpruceLogPedestalBlock extends BaseEntityBlock {
    public static final VoxelShape SHAPE = Block.box(2, 0, 2, 14, 13, 14);

    public SpruceLogPedestalBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        if (blockState.getBlock() == ModBlocks.SPRUCE_LOG_PEDESTAL.get()) {
            return new SpruceLogPedestalBlockEntity(blockPos, blockState);
        }
        return new SpruceLogPedestalBlockEntity(blockPos, blockState);
    }


    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pMovedByPiston) {
        if (pState.getBlock() != pNewState.getBlock()) {
            if (pLevel.getBlockEntity(pPos) instanceof SpruceLogPedestalBlockEntity spruceLogPedestalBlockEntity) {
                Containers.dropContents(pLevel, pPos, spruceLogPedestalBlockEntity);
                pLevel.updateNeighbourForOutputSignal(pPos, this);
            }
            super.onRemove(pState, pLevel, pPos, pNewState, pMovedByPiston);
        }
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHitResult) {
        if (pLevel.getBlockEntity(pPos) instanceof SpruceLogPedestalBlockEntity spruceLogPedestalBlockEntity) {
            ItemStack stackInHand = pPlayer.getItemInHand(pHand);

            if (pPlayer.isCrouching() && !pLevel.isClientSide()) {
                if (pPlayer instanceof ServerPlayer serverPlayer) {
                    NetworkHooks.openScreen(serverPlayer, new SimpleMenuProvider(
                            (id, inventory, player) -> new SpruceLogPedestalMenu(id, inventory, spruceLogPedestalBlockEntity),
                            Component.literal("Spruce Log Pedestal")
                    ), pPos);
                }
                return InteractionResult.SUCCESS;
            }

            if (spruceLogPedestalBlockEntity.isEmpty() && !stackInHand.isEmpty()) {
                spruceLogPedestalBlockEntity.setItem(0, stackInHand.split(1));
                pLevel.playSound(null, pPos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1.5f);
            } else if (!spruceLogPedestalBlockEntity.isEmpty() && stackInHand.isEmpty()) {
                pPlayer.setItemInHand(pHand, spruceLogPedestalBlockEntity.getItem(0).copy());
                spruceLogPedestalBlockEntity.clearContent();
                pLevel.playSound(null, pPos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1f);
            }

            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

}
