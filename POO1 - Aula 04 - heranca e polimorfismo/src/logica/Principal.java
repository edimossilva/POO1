package logica;

import modelo.Computador;
import modelo.Eletronico;
import modelo.Produto;

public class Principal {
	public static void main(String[] args) {
		Computador computador = new Computador(123);
		computador.setProcessador("i7");
		computador.ligar();
		computador.exibirTudo();

		//polimorfismo
		Eletronico eletronico = computador;
		System.out.println(eletronico.isLigado());
		
		//polimorfismo
		Produto produto = eletronico;
		System.out.println(produto.getId());
	}
}
