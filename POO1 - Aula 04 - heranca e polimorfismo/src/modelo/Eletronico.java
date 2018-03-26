package modelo;

public class Eletronico extends Produto {
	private boolean ligado = false;

	protected void ligarEletronico() {
		setLigado(true);
		System.out.println("Ligando eletronico!");
	}

	protected void desligarEletronico() {
		setLigado(false);
		System.out.println("Desligando eletronico!");
	}

	public boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

}
