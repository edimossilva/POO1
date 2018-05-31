package modelo;

import logica.DescontoAVista;
import logica.Estoque;
import logica.Venda;

public class Principal {
	public static void main(String[] args) {
		Produto produto = new Produto("coca-cola", 10);
		Produto produto2 = new Produto("fanta", 5);
		Item item = new Item(produto, 3);
//		item.exibirTotalDetalhado();
		Item item2 = new Item(produto2, 2);
//		item2.exibirTotalDetalhado();
		Venda venda = new Venda();
		venda.adicionarItem(item);
		venda.adicionarItem(item2);
		//venda.exibirTotalDetalhado();
		Estoque estoque = new Estoque();
		estoque.adicionarItem(item);
		estoque.adicionarItem(item2);
		
		venda.vender(estoque, new DescontoAVista(10));
	}
}
