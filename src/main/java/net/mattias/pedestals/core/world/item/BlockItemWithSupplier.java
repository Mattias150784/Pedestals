package net.mattias.pedestals.core.world.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ShulkerBoxBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public class BlockItemWithSupplier extends BlockItem {
    private final RegistryObject<Block> blockSupplier;

    public BlockItemWithSupplier(RegistryObject<Block> blockSupplier, Item.Properties props) {
        super((Block)null, props);
        this.blockSupplier = blockSupplier;
    }

    public Block getBlock() {
        return (Block)this.blockSupplier.get();
    }

    private Block getBlockRaw() {
        return this.blockSupplier.get();
    }

    public FeatureFlagSet requiredFeatures() {
        return this.getBlock().requiredFeatures();
    }

    public boolean canFitInsideContainerItems() {
        return !(this.blockSupplier.get() instanceof ShulkerBoxBlock);
    }



    public void onDestroyed(ItemEntity itemEntity) {
        if (this.blockSupplier.get() instanceof ShulkerBoxBlock) {
            ItemStack itemstack = itemEntity.getItem();
            CompoundTag compoundtag = getBlockEntityData(itemstack);
            if (compoundtag != null && compoundtag.contains("Items", 9)) {
                ListTag listtag = compoundtag.getList("Items", 10);
                Stream<Tag> var10001 = listtag.stream();
                Objects.requireNonNull(CompoundTag.class);
                ItemUtils.onContainerDestroyed(itemEntity, var10001.map(CompoundTag.class::cast).map(ItemStack::of));
            }
        }
    }

    public InteractionResult useOn(UseOnContext pContext) {
        InteractionResult interactionresult = this.place(new BlockPlaceContext(pContext));
        if (!interactionresult.consumesAction() && this.isEdible()) {
            InteractionResult interactionresult1 = this.use(pContext.getLevel(), pContext.getPlayer(), pContext.getHand()).getResult();
            return interactionresult1 == InteractionResult.CONSUME ? InteractionResult.CONSUME_PARTIAL : interactionresult1;
        } else {
            return interactionresult;
        }
    }

    private static <T extends Comparable<T>> BlockState updateState(BlockState pState, Property<T> pProperty, String pValueIdentifier) {
        return pProperty.getValue(pValueIdentifier).map((p_40592_) -> {
            return pState.setValue(pProperty, p_40592_);
        }).orElse(pState);
    }

    private BlockState updateBlockStateFromTag(BlockPos pPos, Level pLevel, ItemStack pStack, BlockState pState) {
        BlockState blockstate = pState;
        CompoundTag compoundtag = pStack.getTag();
        if (compoundtag != null) {
            CompoundTag compoundtag1 = compoundtag.getCompound("BlockStateTag");
            StateDefinition<Block, BlockState> statedefinition = pState.getBlock().getStateDefinition();

            for(String s : compoundtag1.getAllKeys()) {
                Property<?> property = statedefinition.getProperty(s);
                if (property != null) {
                    String s1 = compoundtag1.get(s).getAsString();
                    blockstate = updateState(blockstate, property, s1);
                }
            }
        }

        if (blockstate != pState) {
            pLevel.setBlock(pPos, blockstate, 2);
        }

        return blockstate;
    }

    @Override
    protected BlockState getPlacementState(BlockPlaceContext pContext) {
        BlockState blockstate = this.getBlock().getStateForPlacement(pContext);
        return blockstate != null && this.canPlace(pContext, blockstate) ? blockstate : null;
    }

    @Override
    public void registerBlocks(Map<Block, Item> pBlockToItemMap, Item pItem) {
        pBlockToItemMap.put(this.getBlock(), pItem);
    }

    @Override
    public void removeFromBlockToItemMap(Map<Block, Item> blockToItemMap, Item itemIn) {
        blockToItemMap.remove(this.getBlock());
    }

    public InteractionResult place(BlockPlaceContext pContext) {
        if (!this.getBlock().isEnabled(pContext.getLevel().enabledFeatures())) {
            return InteractionResult.FAIL;
        } else if (!pContext.canPlace()) {
            return InteractionResult.FAIL;
        } else {
            BlockPlaceContext blockplacecontext = this.updatePlacementContext(pContext);
            if (blockplacecontext == null) {
                return InteractionResult.FAIL;
            } else {
                BlockState blockstate = this.getPlacementState(blockplacecontext);
                if (blockstate == null) {
                    return InteractionResult.FAIL;
                } else if (!this.placeBlock(blockplacecontext, blockstate)) {
                    return InteractionResult.FAIL;
                } else {
                    BlockPos blockpos = blockplacecontext.getClickedPos();
                    Level level = blockplacecontext.getLevel();
                    Player player = blockplacecontext.getPlayer();
                    ItemStack itemstack = blockplacecontext.getItemInHand();
                    BlockState blockstate1 = level.getBlockState(blockpos);
                    if (blockstate1.is(blockstate.getBlock())) {
                        blockstate1 = this.updateBlockStateFromTag(blockpos, level, itemstack, blockstate1);
                        this.updateCustomBlockEntityTag(blockpos, level, player, itemstack, blockstate1);
                        blockstate1.getBlock().setPlacedBy(level, blockpos, blockstate1, player, itemstack);
                        if (player instanceof ServerPlayer) {
                            CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer)player, blockpos, itemstack);
                        }
                    }

                    SoundType soundtype = blockstate1.getSoundType(level, blockpos, pContext.getPlayer());
                    level.playSound(player, blockpos, this.getPlaceSound(blockstate1, level, blockpos, pContext.getPlayer()), SoundSource.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
                    level.gameEvent(GameEvent.BLOCK_PLACE, blockpos, GameEvent.Context.of(player, blockstate1));
                    if (player == null || !player.getAbilities().instabuild) {
                        itemstack.shrink(1);
                    }

                    return InteractionResult.sidedSuccess(level.isClientSide);
                }
            }
        }
    }
}