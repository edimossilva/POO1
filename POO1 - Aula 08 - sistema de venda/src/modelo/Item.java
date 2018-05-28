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
		System.out.println(produto + separador1 + preco + separador2 + vezes + quantidade + separador3 + reais + total);
	}

	public String getNomeProduto() {
		return getProduto().getNome();
	}

	public void incrementarQuantidade(int quantidade2) {
		this.quantidade += quantidade2;
	}

	public void decrementarQuantidade(int quantidade2) {
		this.quantidade -= quantidade2;
	}
	@Override
	public String toString() {
		return "Produto: "+getProduto()+" ,quantidade: "+getQuantidade();
	}

	public Item getCopy() {
		return new Item(getProduto().getCopy(), getQuantidade());
	}
}
