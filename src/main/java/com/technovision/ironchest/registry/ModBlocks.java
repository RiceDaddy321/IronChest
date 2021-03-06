package com.technovision.ironchest.registry;

import com.technovision.ironchest.IronChests;
import com.technovision.ironchest.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block IRON_CHEST = new IronChestBlock();
    public static final Block GOLD_CHEST = new GoldChestBlock();
    public static final Block DIAMOND_CHEST = new DiamondChestBlock();
    public static final Block COPPER_CHEST = new CopperChestBlock();
    public static final Block SILVER_CHEST = new SilverChestBlock();
    public static final Block CRYSTAL_CHEST = new CrystalChestBlock();
    public static final Block OBSIDIAN_CHEST = new ObsidianChestBlock();
    public static final Block HOLIDAY_CHEST = new HolidayChestBlock();
    public static final Block DIRT_CHEST = new DirtChestBlock();

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(IronChests.MOD_ID, "iron_chest"), IRON_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(IronChests.MOD_ID, "gold_chest"), GOLD_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(IronChests.MOD_ID, "diamond_chest"), DIAMOND_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(IronChests.MOD_ID, "copper_chest"), COPPER_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(IronChests.MOD_ID, "silver_chest"), SILVER_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(IronChests.MOD_ID, "crystal_chest"), CRYSTAL_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(IronChests.MOD_ID, "obsidian_chest"), OBSIDIAN_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(IronChests.MOD_ID, "holiday_chest"), HOLIDAY_CHEST);
        Registry.register(Registry.BLOCK, new Identifier(IronChests.MOD_ID, "dirt_chest"), DIRT_CHEST);
    }

}
