package modelo;

public class Androide {
	public String modelo;
	public float altura, peso;

	public void falar() {
		String p1 = "Modelo = " + modelo;
		String p2 = "Altura = " + altura;
		String p3 = "Peso = " + peso;
		String sep = "; ";
		String stringFinal = p1 + sep + p2 + sep + p3;

		System.out.println(stringFinal);
	}

	public void calcular() {
		System.out.println("calculando =z");
	}

	public float calcularForca() {
		return altura * peso;
	}

	public void lutar(Androide androide) {
		if (this.calcularForca() > androide.calcularForca()) {
			System.out.println("o vencedor eh " + this.modelo);
		} else {
			System.out.println("o vencedor eh " + androide.modelo);
		}
	}
}
