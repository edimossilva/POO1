package logica;

import java.util.HashMap;

import modelo.Item;

public class Estoque {
	private HashMap<String, Item> itens = new HashMap<String, Item>();

	public void adicionarItem(Item item) {
		if (itemExisteNoMap(item)) {
			Item itemEncontrado = localizaItem(item);
			itemEncontrado.incrementarQuantidade(item.getQuantidade());
		} else {
			itens.put(item.getNomeProduto(), item.getCopy());
		}
	}

	public void decrementaItem(Item item) {
		if (itemExisteNoMap(item)) {
			Item itemEncontrado = localizaItem(item);
			itemEncontrado.decrementarQuantidade(item.getQuantidade());
		} else {
			System.out.println("quantidade insuficiente");
		}
	}

	private Item localizaItem(Item item) {
		return itens.get(item.getNomeProduto());
	}

	private boolean itemExisteNoMap(Item item) {
		return itens.containsKey(item.getNomeProduto());
	}

	public void exibirItem(Item item) {
		if (itemExisteNoMap(item)) {
			Item itemEncontrado = localizaItem(item);
			System.out.println(itemEncontrado);
		}
	}

	public boolean temItemDisponivel(Item item) {
		Item itemEncontrado = localizaItem(item);
		return itemEncontrado.getQuantidade() >= item.getQuantidade();
	}
}
