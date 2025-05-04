package com.wdcftgg.wdcftggTemplates.blocks;

import com.wdcftgg.wdcftggTemplates.WdcftggLib;
import com.wdcftgg.wdcftggTemplates.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import javax.annotation.Nullable;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(Material material, String name)
    {
        super(material);
        setTranslationKey(WdcftggLib.MODID + "." + name);
        setRegistryName(name);

        ModBlocks.BLOCKS.add(this);
    }
    @Override
    public void registerModels() {
        WdcftggLib.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}