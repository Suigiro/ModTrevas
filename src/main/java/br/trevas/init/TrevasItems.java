package br.trevas.init;

import br.trevas.Referencia;
import br.trevas.TrevasMod;
import br.trevas.TrevasTab;
import br.trevas.items.InsignaAgua;
import br.trevas.items.InsignaAnimais;
import br.trevas.items.InsignaAr;
import br.trevas.items.InsignaArkanum;
import br.trevas.items.InsignaHumano;
import br.trevas.items.InsignaLuz;
import br.trevas.items.InsignaMetaMagia;
import br.trevas.items.InsignaPlantas;
import br.trevas.items.InsignaSpiritum;
import br.trevas.items.InsignaTerra;
import br.trevas.items.InsignaTrevas;
import br.trevas.items.LivroBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TrevasItems {
	public static Item insigna_agua;
	public static Item insigna_animais;
	public static Item insigna_ar;
	public static Item insigna_arkanum;
	public static Item insigna_humano;
	public static Item insigna_luz;
	public static Item insigna_metamagia;
	public static Item insigna_plantas;
	public static Item insigna_spiritum;
	public static Item insigna_terra;
	public static Item insigna_trevas;
	public static Item livro_base;
	
	public static void init(){
		
		insigna_agua = new InsignaAgua();			
		insigna_animais = new InsignaAnimais();				
		insigna_ar = new InsignaAr();				
		insigna_arkanum = new InsignaArkanum();				
		insigna_humano = new InsignaHumano();				
		insigna_luz = new InsignaLuz();
		insigna_metamagia = new InsignaMetaMagia();
		insigna_plantas = new InsignaPlantas();
		insigna_spiritum = new InsignaSpiritum();
		insigna_terra = new InsignaTerra();
		insigna_trevas = new InsignaTrevas();
		livro_base = new LivroBase();
		
	}
	public static void register()
	{
		GameRegistry.registerItem(insigna_agua, insigna_agua.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(insigna_agua);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Referencia.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	}