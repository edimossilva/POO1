package logica;

import modelo.Conta;

public class Principal {
	public static void main(String[] args) {
		Conta conta = new Conta("Marcelo", 1000, 5);
		conta.sacar(500);
		System.out.println(conta.getSaldo());
		conta.depositar(500);
		System.out.println(conta.getSaldo());
		conta.exibirInformacoes();
	}
}
