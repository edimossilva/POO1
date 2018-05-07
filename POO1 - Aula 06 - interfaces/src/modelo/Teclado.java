package modelo;

public class Teclado implements Transportavel{
	public void teclar() {
		System.out.println("estao me teclando");
	}

	@Override
	public void transportar() {
		System.out.println("desconecte o cabo usb antes de me transportar");
	}
}
