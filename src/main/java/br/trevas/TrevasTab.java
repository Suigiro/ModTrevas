package br.trevas;

import br.trevas.init.TrevasItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TrevasTab extends CreativeTabs{

	public static CreativeTabs tabTrevas;

	public TrevasTab(String label) {
		super(label);
		this.setBackgroundImageName("trevas.png");
		}

	@Override
	public Item getTabIconItem() {
		return TrevasItems.livro_base;
	}

}
