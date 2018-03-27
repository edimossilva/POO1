package modelo;

public class Conta {
	private float saldo;
	private float custoPorOperacao;
	private String titular;

	public Conta() {
	}

	public Conta(String titular, float saldo) {
		setTitular(titular);
		setSaldo(saldo);
	}

	public Conta(String titular, float saldo, float custoPorOperacao) {
		setTitular(titular);
		setSaldo(saldo);
		setCustoPorOperacao(custoPorOperacao);
	}

	public boolean sacar(float valor) {
		float valorRealSaque = valor + getCustoPorOperacao();
		if (getSaldo() >= valorRealSaque) {
			debitar(valor);
			return true;
		}
		return false;
	}

	private void debitar(float valor) {
		debitarCustoDeOperacao();
		setSaldo(getSaldo());
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getCustoPorOperacao() {
		return custoPorOperacao;
	}

	public void setCustoPorOperacao(float custoPorOperacao) {
		this.custoPorOperacao = custoPorOperacao;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void depositar(int valor) {
		debitarCustoDeOperacao();
		setSaldo(getSaldo() + valor);
	}

	private void debitarCustoDeOperacao() {
		setSaldo(getSaldo() - getCustoPorOperacao());
	}

	public void exibirInformacoes() {
		debitarCustoDeOperacao();
		System.out.println("Saldo = " + getSaldo());
		System.out.println("Custo por operacao = " + getCustoPorOperacao());
		System.out.println("Titular = " + getTitular());

	}

}
