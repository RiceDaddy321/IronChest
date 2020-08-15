package com.technovision.extrachests.registry;

import com.technovision.extrachests.ExtraChests;
import com.technovision.extrachests.blocks.blockentities.GenericExtraChestBlockEntity;
import com.technovision.extrachests.blocks.blockentities.GoldChestBlockEntity;
import com.technovision.extrachests.blocks.blockentities.IronChestBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntityType {

    public static final BlockEntityType<IronChestBlockEntity> IRON_CHEST =
            BlockEntityType.Builder.create(IronChestBlockEntity::new, ModBlocks.IRON_CHEST).build(null);

    public static final BlockEntityType<GoldChestBlockEntity> GOLD_CHEST =
            BlockEntityType.Builder.create(GoldChestBlockEntity::new, ModBlocks.GOLD_CHEST).build(null);

    public static void registerBlockEntities() {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(ExtraChests.MOD_ID, "iron_chest"), IRON_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(ExtraChests.MOD_ID, "gold_chest"), GOLD_CHEST);
    }
}
