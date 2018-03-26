package modelo;

public class Computador extends Eletronico {
	private String processador;

	public Computador(int id) {
		setId(id);
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public void ligar() {
		this.ligarEletronico();
	}

	public void exibirTudo() {
		System.out.println("Informacoes: id = " + getId() + ", processador = " + getProcessador());
	}
}
