package com.Drppp.hongmengtech.tile;

import static gregapi.data.CS.*;

import com.Drppp.hongmengtech.tile.multiblocks.MutiTileEntityLargeBuzzsaw;
import com.Drppp.hongmengtech.tile.multiblocks.MutiTileEntityLargeRoastingOven;
import gregapi.data.*;
import gregapi.item.prefixitem.PrefixItem;
import gregapi.tileentity.multiblocks.MultiTileEntityMultiBlockPart;
import gregapi.util.ST;
import gregtech.tileentity.multiblocks.MultiTileEntityMixer;
import gregtech.tileentity.multiblocks.MultiTileEntityOven;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.Drppp.hongmengtech.tile.multiblocks.MutiTileEntityAdamantiumLargeHeatExchanger;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import gregapi.block.MaterialMachines;
import gregapi.block.MaterialScoopable;
import gregapi.block.multitileentity.MultiTileEntityBlock;
import gregapi.block.multitileentity.MultiTileEntityRegistry;
import gregapi.oredict.OreDictMaterial;
import gregapi.util.UT;
import net.minecraft.tileentity.TileEntity;

public class tileEntityInit {

    public static void init(FMLInitializationEvent aEvent) {
        MultiTileEntityRegistry aRegistry = MultiTileEntityRegistry.getRegistry("gt.multitileentity");
        MultiTileEntityBlock aMetal = MultiTileEntityBlock
            .getOrCreate(MD.GT.mID, "iron", Material.iron, Block.soundTypeMetal, TOOL_pickaxe, 0, 0, 15, F, F), aMetalChips = MultiTileEntityBlock.getOrCreate(MD.GT.mID, "iron", Material.iron, Block.soundTypeMetal, TOOL_shovel, 0, 0, 15, F, F), aMetalWires = MultiTileEntityBlock.getOrCreate(MD.GT.mID, "machine", MaterialMachines.instance, Block.soundTypeMetal, TOOL_cutter, 0, 0, 15, F, F), aMachine = MultiTileEntityBlock.getOrCreate(MD.GT.mID, "machine", MaterialMachines.instance, Block.soundTypeMetal, TOOL_wrench, 0, 0, 15, F, F),
            aWooden = MultiTileEntityBlock
                .getOrCreate(MD.GT.mID, "wood", Material.wood, Block.soundTypeWood, TOOL_axe, 0, 0, 15, F, F),
            aBush = MultiTileEntityBlock
                .getOrCreate(MD.GT.mID, "leaves", Material.leaves, Block.soundTypeGrass, TOOL_axe, 0, 0, 15, F, F),
            aStone = MultiTileEntityBlock
                .getOrCreate(MD.GT.mID, "rock", Material.rock, Block.soundTypeStone, TOOL_pickaxe, 0, 0, 15, F, F),
            aWool = MultiTileEntityBlock
                .getOrCreate(MD.GT.mID, "cloth", Material.cloth, Block.soundTypeCloth, TOOL_shears, 0, 0, 15, F, F),
            aTNT = MultiTileEntityBlock
                .getOrCreate(MD.GT.mID, "tnt", Material.tnt, Block.soundTypeGrass, TOOL_pickaxe, 0, 0, 15, F, F),
            aUtilMetal = MultiTileEntityBlock
                .getOrCreate(MD.GT.mID, "redstoneLight", Material.redstoneLight, Block.soundTypeMetal, TOOL_pickaxe, 0, 0, 15, F, F),
            aUtilStone = MultiTileEntityBlock
                .getOrCreate(MD.GT.mID, "redstoneLight", Material.redstoneLight, Block.soundTypeStone, TOOL_pickaxe, 0, 0, 15, F, F),
            aUtilWood = MultiTileEntityBlock
                .getOrCreate(MD.GT.mID, "redstoneLight", Material.redstoneLight, Block.soundTypeWood, TOOL_axe, 0, 0, 15, F, F),
            aUtilWool = MultiTileEntityBlock
                .getOrCreate(MD.GT.mID, "redstoneLight", Material.redstoneLight, Block.soundTypeCloth, TOOL_shears, 0, 0, 15, F, F),
            aHive = MultiTileEntityBlock
                .getOrCreate(MD.GT.mID, "rock", MaterialScoopable.instance, Block.soundTypeWood, TOOL_scoop, 0, 0, 15, F, F);
        OreDictMaterial aMat;
        Class<? extends TileEntity> aClass;
        //艾德曼大型热交换
        aMat = ANY.W;
        aRegistry.add("Adamantium Large Heat Exchanger", "Multiblock Machines", 17200, 17101, MutiTileEntityAdamantiumLargeHeatExchanger.class, aMat.mToolQuality, 16, aMachine, UT.NBT.make(NBT_MATERIAL, aMat, NBT_HARDNESS, 6.0F, NBT_RESISTANCE, 6.0F, NBT_TEXTURE, "adamantiumlargeheatexchanger", NBT_OUTPUT, 131072, NBT_FUELMAP, FM.Hot, NBT_ENERGY_EMITTED, TD.Energy.HU, NBT_COLOR, 0XEFEFEF), "DDD", "PMP", "DDD", 'M', aRegistry.getItem(18025), 'D', OP.plateDense.dat(MT.AnnealedCopper), 'P', OP.pipeHuge.dat(ANY.Cu));
        //大型储电箱部件
        aMat = MT.StainlessSteel;
        aClass = MultiTileEntityMultiBlockPart.class;
        aRegistry.add("Large Accumulator Part", "Multiblock Machines", 18109, 17101, aClass, aMat.mToolQuality, 64, aMachine , UT.NBT.make(NBT_MATERIAL, aMat, NBT_HARDNESS,   4.0F, NBT_RESISTANCE,   4.0F, NBT_TEXTURE, "largeaccumulatorparts", NBT_DESIGNS, 0), "GGG", "GwG", "GMG", 'M', OP.casingMachineDouble.dat(aMat), 'G', OP.plate.dat(MT.BatteryAlloy));
        //大型蓄电器

        //大型焙烧炉
        aMat = MT.Invar;
        aRegistry.add("Large Roasting Oven", "Multiblock Machines", 18111, 17101, MutiTileEntityLargeRoastingOven.class, aMat.mToolQuality, 16, aMachine , UT.NBT.make(NBT_MATERIAL, aMat, NBT_HARDNESS,   6.0F, NBT_RESISTANCE,   6.0F, NBT_TEXTURE, "largeroastingoven", NBT_INPUT,  512, NBT_INPUT_MIN,  512, NBT_INPUT_MAX,4096, NBT_EFFICIENCY,5000, NBT_ENERGY_ACCEPTED, TD.Energy.EU, NBT_RECIPEMAP, RM.Roasting, NBT_INV_SIDE_AUTO_OUT, SIDE_BOTTOM, NBT_TANK_SIDE_AUTO_OUT, SIDE_BOTTOM, NBT_CHEAP_OVERCLOCKING, T, NBT_PARALLEL,  64, NBT_PARALLEL_DURATION, T ), "PMP", "PwP", "RPC", 'M', aRegistry.getItem(18007), 'R', IL.Processor_Crystal_Ruby, 'C', OD_CIRCUITS[6], 'P', OP.plateDense.dat(aMat));
        //大型圆锯
        aMat = MT.StainlessSteel;
        aRegistry.add("Large Batch Buzzsaw", "Multiblock Machines", 18112, 17101, MutiTileEntityLargeBuzzsaw.class, aMat.mToolQuality, 16, aMachine   , UT.NBT.make(NBT_MATERIAL, aMat, NBT_HARDNESS,   6.0F, NBT_RESISTANCE,   6.0F, NBT_TEXTURE, "largebuzzsaw", NBT_INPUT,  512, NBT_INPUT_MIN,  512, NBT_INPUT_MAX,4096 , NBT_ENERGY_ACCEPTED, TD.Energy.RU, NBT_RECIPEMAP, RM.Cutter, NBT_INV_SIDE_AUTO_OUT, SIDE_BOTTOM, NBT_TANK_SIDE_AUTO_OUT, SIDE_BOTTOM, NBT_CHEAP_OVERCLOCKING, T, NBT_PARALLEL, 64, NBT_PARALLEL_DURATION, T ), "PSP", "PSP", "RMC", 'M', aRegistry.getItem(20063), 'R', IL.Processor_Crystal_Ruby, 'C', OD_CIRCUITS[6], 'P', OP.plateDense.dat(aMat), 'S', OP.stickLong.dat(aMat));

    }
}
