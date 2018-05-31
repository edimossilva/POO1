package logica;

import java.util.ArrayList;

import modelo.Item;

public class Venda {
	private ArrayList<Item> itemList = new ArrayList<Item>();

	public void adicionarItem(Item item) {
		itemList.add(item);
	}

	public void vender(Estoque estoque, DescontoAVista desconto) {
		boolean podeVender = true;
		for (Item item : itemList) {
			if (!estoque.temItemDisponivel(item)) {
				System.out.println("nao pode vender");
				podeVender = false;
				break;
			}
		}
		if (podeVender) {
			for (Item item : itemList) {
				estoque.decrementaItem(item);
			}
			exibirTotalDetalhado(desconto);
			System.out.println("Venda realizada");
		}

	}

	public double calcularTotal(DescontoAVista desconto) {
		double total = 0;
		for (Item item : itemList) {
			total += item.calcularTotal(desconto);
		}
		return total;
	}

	public void exibirTotalDetalhado(DescontoAVista desconto) {
		System.out.println("Nota Fiscal");
		for (Item item : itemList) {
			item.exibirTotalDetalhado( desconto);
		}
		String total = "Total = R$" + calcularTotal(desconto);
		System.out.println(total);
	}
}
