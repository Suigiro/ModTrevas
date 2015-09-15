package br.trevas;

import br.trevas.init.TrevasBlocks;
import br.trevas.init.TrevasItems;
import br.trevas.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Referencia.MOD_ID, name = Referencia.MOD_NAME, version = Referencia.MOD_VERSION)
public class TrevasMod {
	@SidedProxy(clientSide = Referencia.CLIENT_PROXY, serverSide = Referencia.SERVER_PROXY)
	public static CommonProxy proxy;
	
	public static final TrevasTab tabTrevas = new TrevasTab("tabTrevas");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		TrevasBlocks.init();
		TrevasBlocks.register();
		TrevasItems.init();
		TrevasItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
