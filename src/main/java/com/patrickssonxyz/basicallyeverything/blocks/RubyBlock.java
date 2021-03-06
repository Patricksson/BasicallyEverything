package com.patrickssonxyz.basicallyeverything.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block {


    public RubyBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(25.0f,6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
}
