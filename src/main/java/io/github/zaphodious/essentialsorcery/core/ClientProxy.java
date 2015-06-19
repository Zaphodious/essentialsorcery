package io.github.zaphodious.essentialsorcery.core;

import io.github.zaphodious.essentialsorcery.client.render.block.BlockRenderRegister;
import io.github.zaphodious.essentialsorcery.client.render.entity.EntityRenderRegister;
import io.github.zaphodious.essentialsorcery.client.render.item.ItemRenderRegister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        ItemRenderRegister.registerVariants();
        
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        BlockRenderRegister.registerBlockRenderer();
        //ModBlocks.registerRenders();
        ItemRenderRegister.registerItemRenderer();
        
        EntityRenderRegister.renderEntities();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
        
    }
	
}