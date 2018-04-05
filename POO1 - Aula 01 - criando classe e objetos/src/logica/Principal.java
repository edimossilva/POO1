package logica;

import modelo.Pessoa;

public class Principal {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "marcelo";
		pessoa1.idade = 18;
		pessoa1.altura = 1.85f;
		pessoa1.peso = 70.8f;
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "natali";
		pessoa2.idade = 19;
		pessoa2.altura = 1.65f;
		pessoa2.peso = 55.0f;
		
		pessoa1.falar();
		System.out.println("imc = " + pessoa1.calcularImc());
		pessoa2.falar();
		System.out.println("imc = " + pessoa2.calcularImc());
//		pessoa1.conversar(pessoa2);
//		pessoa2.conversar(pessoa1);
		

	}
}
