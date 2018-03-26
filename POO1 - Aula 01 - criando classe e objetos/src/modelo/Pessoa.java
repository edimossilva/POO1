package modelo;

public class Pessoa {
	public String nome;
	public float altura, peso;
	public int idade;

	public void correr() {

	}

	public void falar() {
		System.out.println("Meu nome eh " + nome + " e minha idade eh " + idade);
	}

	public float calcularImc() {
		return peso / (altura * altura);
	}

	public void conversar(Pessoa pessoa) {
		System.out.println(this.nome + " esta conversando com " + pessoa.nome);
	}

}
