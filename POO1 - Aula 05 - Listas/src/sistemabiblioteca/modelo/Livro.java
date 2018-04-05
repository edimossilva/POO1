package sistemabiblioteca.modelo;

import java.util.ArrayList;

public class Livro {
	private String titulo;
	private int qtdPaginas;

	public Livro(String titulo, int qtdPaginas) {
		this.titulo = titulo;
		this.qtdPaginas = qtdPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public void exibeInformacoes(ArrayList<Livro> livroList) {
		String indice = "Indice: " + livroList.indexOf(this);
		String titulo = "titulo: " + getTitulo();
		String qtdPaginas = "qtdPaginas: " + getQtdPaginas();
		System.out.println(indice + ", " + titulo + ", " + qtdPaginas);

	}

}
