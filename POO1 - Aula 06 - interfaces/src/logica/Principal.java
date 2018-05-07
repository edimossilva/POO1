package logica;

import java.util.ArrayList;

import modelo.Funcionario;
import modelo.Pessoa;
import modelo.Teclado;
import modelo.Transportavel;

public class Principal {
	public static void main(String[] args) {

		System.out.println("pessoa");
		Pessoa pessoa = new Pessoa();
		pessoa.pensar();
		pessoa.transportar();

		System.out.println("teclado");
		Teclado teclado = new Teclado();
		teclado.teclar();
		teclado.transportar();

		ArrayList<Transportavel> transportaveis = new ArrayList<Transportavel>();
		transportaveis.add(pessoa);
		transportaveis.add(teclado);

		System.out.println("Funcionario");
		Funcionario funcionario = new Funcionario();
		funcionario.mover(transportaveis);

		// System.out.println("transportavel1");
		// Transportavel transportavel1 = pessoa;
		// transportavel1.transportar();
		//
		// System.out.println("transportavel2");
		// Transportavel transportavel2 = teclado;
		// transportavel2.transportar();
	}
}
