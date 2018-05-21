package modelo;

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
		venda.exibirTotalDetalhado();
	}
}
