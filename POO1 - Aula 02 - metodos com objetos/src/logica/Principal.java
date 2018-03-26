package logica;

import modelo.Androide;

public class Principal {
	public static void main(String[] args) {
		Androide android = new Androide();
		android.modelo = "XTZ";
		android.altura = 1.2f;
		android.peso = 80.f;
		Androide android2 = new Androide();
		android2.modelo = "kkkk";
		android2.altura = 1.6f;
		android2.peso = 43.f;
		android.lutar(android2);

	}
}
