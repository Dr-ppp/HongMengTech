package com.Drppp.hongmengtech.tile;

import static gregapi.data.CS.*;

import gregapi.data.*;
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

public class tileEntityInit {

    public static void init(FMLInitializationEvent aEvent) {
        MultiTileEntityRegistry aRegistry = MultiTileEntityRegistry.getRegistry("gt.multitileentity");
        MultiTileEntityBlock aMetal = MultiTileEntityBlock
            .getOrCreate(MD.GT.mID, "iron", Material.iron, Block.soundTypeMetal, TOOL_pickaxe, 0, 0, 15, F, F),
            aMetalChips = MultiTileEntityBlock
                .getOrCreate(MD.GT.mID, "iron", Material.iron, Block.soundTypeMetal, TOOL_shovel, 0, 0, 15, F, F),
            aMetalWires = MultiTileEntityBlock.getOrCreate(
                MD.GT.mID,
                "machine",
                MaterialMachines.instance,
                Block.soundTypeMetal,
                TOOL_cutter,
                0,
                0,
                15,
                F,
                F),
            aMachine = MultiTileEntityBlock.getOrCreate(
                MD.GT.mID,
                "machine",
                MaterialMachines.instance,
                Block.soundTypeMetal,
                TOOL_wrench,
                0,
                0,
                15,
                F,
                F),
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
            aUtilMetal = MultiTileEntityBlock.getOrCreate(
                MD.GT.mID,
                "redstoneLight",
                Material.redstoneLight,
                Block.soundTypeMetal,
                TOOL_pickaxe,
                0,
                0,
                15,
                F,
                F),
            aUtilStone = MultiTileEntityBlock.getOrCreate(
                MD.GT.mID,
                "redstoneLight",
                Material.redstoneLight,
                Block.soundTypeStone,
                TOOL_pickaxe,
                0,
                0,
                15,
                F,
                F),
            aUtilWood = MultiTileEntityBlock.getOrCreate(
                MD.GT.mID,
                "redstoneLight",
                Material.redstoneLight,
                Block.soundTypeWood,
                TOOL_axe,
                0,
                0,
                15,
                F,
                F),
            aUtilWool = MultiTileEntityBlock.getOrCreate(
                MD.GT.mID,
                "redstoneLight",
                Material.redstoneLight,
                Block.soundTypeCloth,
                TOOL_shears,
                0,
                0,
                15,
                F,
                F),
            aHive = MultiTileEntityBlock.getOrCreate(
                MD.GT.mID,
                "rock",
                MaterialScoopable.instance,
                Block.soundTypeWood,
                TOOL_scoop,
                0,
                0,
                15,
                F,
                F);
        OreDictMaterial aMat;
        aMat = ANY.W;
        aRegistry.add("Adamantium Large Heat Exchanger", "Multiblock Machines", 17200, 17101, MutiTileEntityAdamantiumLargeHeatExchanger.class, aMat.mToolQuality, 16, aMachine, UT.NBT.make(
            NBT_MATERIAL,
                aMat,
                NBT_HARDNESS,
                6.0F,
                NBT_RESISTANCE,
                6.0F,
                NBT_TEXTURE,
                "adamantiumlargeheatexchanger",
                NBT_OUTPUT,
                65536,
                NBT_FUELMAP,
                FM.Hot,
                NBT_ENERGY_EMITTED,
                TD.Energy.HU,
                NBT_COLOR,
                0XEFEFEF),
            "DDD",
            "PMP",
            "DDD",
            'M',
            aRegistry.getItem(18025),
            'D',
            OP.plateDense.dat(MT.AnnealedCopper),
            'P',
            OP.pipeHuge.dat(ANY.Cu));

    }
}
