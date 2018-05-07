import java.math.BigDecimal;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private int idade;
	private BigDecimal altura;

	public Pessoa(String nome, int idade, BigDecimal altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		if (this.getIdade() > pessoa.getIdade()) {
			return 1;
		} else if (this.getIdade() < pessoa.getIdade()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "\nnome = " + getNome() + ", idade = " + getIdade() + ", altura" + getAltura();
	}

}
