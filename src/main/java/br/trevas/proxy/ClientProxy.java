package br.trevas.proxy;

import br.trevas.init.TrevasBlocks;
import br.trevas.init.TrevasItems;


public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		TrevasBlocks.registerRenders();
		TrevasItems.registerRenders();
	}
}
