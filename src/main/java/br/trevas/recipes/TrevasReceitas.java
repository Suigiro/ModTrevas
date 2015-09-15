package br.trevas.recipes;

import br.trevas.init.TrevasBlocks;
import br.trevas.init.TrevasItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TrevasReceitas {

	public static void init(){
		//itemsStack
		ItemStack stack1 = new ItemStack(TrevasItems.insigna_agua, 9);
		ItemStack stack2 = new ItemStack(TrevasItems.insigna_animais, 9);
		ItemStack stack3 = new ItemStack(TrevasItems.insigna_ar, 9);
		ItemStack stack4 = new ItemStack(TrevasItems.insigna_arkanum, 9);
		ItemStack stack5 = new ItemStack(TrevasItems.insigna_humano, 9);
		ItemStack stack6 = new ItemStack(TrevasItems.insigna_luz, 9);
		ItemStack stack7 = new ItemStack(TrevasItems.insigna_metamagia, 9);
		ItemStack stack8 = new ItemStack(TrevasItems.insigna_plantas, 9);
		ItemStack stack9 = new ItemStack(TrevasItems.insigna_spiritum, 9);
		ItemStack stack10 = new ItemStack(TrevasItems.insigna_terra, 9);
		ItemStack stack11 = new ItemStack(TrevasItems.insigna_trevas, 9);
		
		//forma
		
		//sem forma
		GameRegistry.addShapelessRecipe(stack1, TrevasBlocks.agua_bloco);
		//fornalha
	}

}
