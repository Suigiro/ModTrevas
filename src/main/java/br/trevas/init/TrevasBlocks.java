package br.trevas.init;

import br.trevas.Referencia;
import br.trevas.TrevasMod;
import br.trevas.TrevasTab;
import br.trevas.blocks.Altar;
import br.trevas.blocks.BlocoAgua;
import br.trevas.blocks.BlocoAnimais;
import br.trevas.blocks.BlocoAr;
import br.trevas.blocks.BlocoArkanum;
import br.trevas.blocks.BlocoHumano;
import br.trevas.blocks.BlocoLuz;
import br.trevas.blocks.BlocoMetaMagia;
import br.trevas.blocks.BlocoPlantas;
import br.trevas.blocks.BlocoSpiritum;
import br.trevas.blocks.BlocoTerra;
import br.trevas.blocks.BlocoTrevas;
import br.trevas.blocks.OreAgua;
import br.trevas.blocks.OreAnimais;
import br.trevas.blocks.OreAr;
import br.trevas.blocks.OreArkanum;
import br.trevas.blocks.OreHumano;
import br.trevas.blocks.OreLuz;
import br.trevas.blocks.OreMetaMagia;
import br.trevas.blocks.OrePlantas;
import br.trevas.blocks.OreSpiritum;
import br.trevas.blocks.OreTerra;
import br.trevas.blocks.OreTrevas;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class TrevasBlocks {
	
	public static Block agua_bloco;
	public static Block animais_bloco;
	public static Block ar_bloco;
	public static Block arkanum_bloco;
	public static Block humano_bloco;
	public static Block luz_bloco;
	public static Block metamagia_bloco;
	public static Block plantas_bloco;
	public static Block spiritum_bloco;
	public static Block terra_bloco;
	public static Block trevas_bloco;
	
	public static Block agua_Ore;
	public static Block animais_Ore;
	public static Block ar_Ore;
	public static Block arkanum_Ore;
	public static Block humano_Ore;
	public static Block luz_Ore;
	public static Block metamagia_Ore;
	public static Block plantas_Ore;
	public static Block spiritum_Ore;
	public static Block terra_Ore;
	public static Block trevas_Ore;
	
	public static Block altar;
	
	public static void init(){
		
		agua_bloco = new BlocoAgua(Material.iron);		
		animais_bloco = new BlocoAnimais(Material.iron);	
		ar_bloco = new BlocoAr(Material.iron);
		arkanum_bloco = new BlocoArkanum(Material.iron);
		humano_bloco = new BlocoHumano(Material.iron);
		luz_bloco = new BlocoLuz(Material.glass);
		metamagia_bloco = new BlocoMetaMagia(Material.glass);
		plantas_bloco = new BlocoPlantas(Material.glass);
		spiritum_bloco = new BlocoSpiritum(Material.glass);
		terra_bloco = new BlocoTerra(Material.glass);
		trevas_bloco = new BlocoTrevas(Material.glass);
		agua_Ore = new OreAgua(Material.rock);
		animais_Ore = new OreAnimais(Material.rock);
		ar_Ore = new OreAr(Material.rock);
		arkanum_Ore = new OreArkanum(Material.rock);
		humano_Ore = new OreHumano(Material.rock);
		luz_Ore = new OreLuz(Material.rock);
		metamagia_Ore = new OreMetaMagia(Material.rock);
		plantas_Ore = new OrePlantas(Material.rock);
		spiritum_Ore = new OreSpiritum(Material.rock);
		terra_Ore = new OreTerra(Material.rock);
		trevas_Ore = new OreTrevas(Material.rock);
		altar = new Altar(Material.iron);
}
	public static void register()
	{
		GameRegistry.registerBlock(agua_bloco, agua_bloco.getUnlocalizedName().substring(5));
	}	
	
	public static void registerRenders()
	{
		registerRender(agua_bloco);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Referencia.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
