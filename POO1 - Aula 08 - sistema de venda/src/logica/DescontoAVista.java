package logica;

public class DescontoAVista {
	private double porcentagem;
	
	public DescontoAVista(float porcentagem) {
		this.porcentagem = porcentagem;
	}

	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
}
