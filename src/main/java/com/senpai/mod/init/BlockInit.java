package com.senpai.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.senpai.mod.objects.blocks.BlockBase;
import com.senpai.mod.objects.blocks.BlockDirts;
import com.senpai.mod.objects.blocks.BlockLeaf;
import com.senpai.mod.objects.blocks.BlockLogs;
import com.senpai.mod.objects.blocks.BlockOres;
import com.senpai.mod.objects.blocks.BlockPlank;
import com.senpai.mod.objects.blocks.BlockSantaHat;
import com.senpai.mod.objects.blocks.BlockSaplings;
import com.senpai.mod.objects.blocks.machines.sinterer.BlockSinteringFurnace;
import com.senpai.mod.util.handlers.EnumHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	public static final Block BLOCK_TONICIUM = new BlockBase("block_tonicium", Material.IRON);
	public static final Block ALUMINIUM = new BlockBase("block_aluminium", Material.IRON);
	
	public static final Block ORE_END = new BlockOres("ore_end", "end", EnumHandler.EnumType.COPPER);
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld", EnumHandler.EnumType.COPPER);
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether", EnumHandler.EnumType.COPPER);
	
	
	public static final Block PLANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLINGS = new BlockSaplings("sapling");	
	public static final Block DIRT = new BlockDirts("dirt");
	
	public static final Block SINTERING_FURNACE = new BlockSinteringFurnace("sintering_furnace");

}
