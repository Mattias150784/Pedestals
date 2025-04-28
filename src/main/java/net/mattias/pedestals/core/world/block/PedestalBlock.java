package net.mattias.pedestals.core.world.block;

import com.google.common.collect.ImmutableMap;
import net.mattias.pedestals.core.registry.ModBlocks;
import net.mattias.pedestals.core.world.block.entity.PedestalBlockEntity;
import net.mattias.pedestals.core.world.inventory.PedestalMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.*;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.function.Function;

public class PedestalBlock extends BaseEntityBlock {

    public static final VoxelShape SHAPE = Block.box(2, 0, 2, 14, 13, 14);

    public PedestalBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getInteractionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return SHAPE;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    protected ImmutableMap<BlockState, VoxelShape> getShapeForEachState(Function<BlockState, VoxelShape> pShapeGetter) {
        ImmutableMap<BlockState, VoxelShape> map = ImmutableMap.of(this.stateDefinition.any(), SHAPE);
        return map;
    }

    @Override
    public boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
        return false;
    }

    @Override
    public boolean canBeReplaced(BlockState pState, Fluid pFluid) {
        return false;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return pState.getBlock() instanceof PedestalBlock ? new PedestalBlockEntity(pPos, pState) : null;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pMovedByPiston) {
        if (pState.getBlock() != pNewState.getBlock()) {
            if (pLevel.getBlockEntity(pPos) instanceof PedestalBlockEntity pedestalBlockEntity) {
                Containers.dropContents(pLevel, pPos, pedestalBlockEntity);
                pLevel.updateNeighbourForOutputSignal(pPos, this);
            }
            super.onRemove(pState, pLevel, pPos, pNewState, pMovedByPiston);
        }
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHitResult) {
        if (pLevel.getBlockEntity(pPos) instanceof PedestalBlockEntity pedestalBlockEntity) {
            ItemStack stackInHand = pPlayer.getItemInHand(pHand);

            if (pPlayer.isCrouching() && !pLevel.isClientSide()) {
                if (pPlayer instanceof ServerPlayer serverPlayer) {
                    NetworkHooks.openScreen(serverPlayer, new SimpleMenuProvider(
                            (id, inventory, player) -> new PedestalMenu(id, inventory, pedestalBlockEntity),
                            Component.literal("Pedestal")
                    ), pPos);

                    // NetworkHooks.openScreen(serverPlayer, pedestalBlockEntity, pPos);
                }
                return InteractionResult.SUCCESS;
            }
            else {

                if (pedestalBlockEntity.isEmpty()) {
                    if (!stackInHand.isEmpty()) {
                        pedestalBlockEntity.setItem(0, stackInHand.split(1));
                        pLevel.playSound(null, pPos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1.5f);
                    }
                    else {
                        pLevel.destroyBlock(pPos, true);
                    }
                }
                else if (!pedestalBlockEntity.isEmpty() && stackInHand.isEmpty()) {
                    pPlayer.setItemInHand(pHand, pedestalBlockEntity.getItem(0).copy());
                    pedestalBlockEntity.clearContent();
                    pLevel.playSound(null, pPos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1f);
                }
            }

            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public boolean canHarvestBlock(BlockState state, BlockGetter level, BlockPos pos, Player player) {
        return true;
    }
}
