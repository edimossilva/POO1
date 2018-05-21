package modelo;

public class Item {
	private Produto produto;
	private int quantidade;

	public Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double calcularTotal() {
		return getProduto().getPreco() * getQuantidade();
	}

	public void exibirTotalDetalhado() {
		String produto = getProduto().getNome();
		String preco = getProduto().getPreco() + "";
		String separador1 = "(";
		String separador2 = ")";
		String vezes = " x ";
		String quantidade = "quantidade(" + getQuantidade() + ")";
		String separador3 = " = ";
		String total = calcularTotal() + "";
		String reais = "R$";
		System.out.println(produto + separador1 + preco + 
		separador2 + vezes + quantidade + separador3 + reais + total);
	}
}
