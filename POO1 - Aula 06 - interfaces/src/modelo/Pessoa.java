package modelo;

public class Pessoa implements Transportavel{
	public void pensar() {
		System.out.println("Estou pensando");
	}

	@Override
	public void transportar() {
		System.out.println("deixa que eu vou soh");
	}
}
