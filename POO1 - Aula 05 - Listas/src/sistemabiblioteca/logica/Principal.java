package sistemabiblioteca.logica;

import java.util.ArrayList;
import java.util.Scanner;

import sistemabiblioteca.modelo.Livro;

public class Principal {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Livro> livroList = new ArrayList<Livro>();
		int decisao = 1;
		while (decisao != 0) {
			exibeMenu();
			decisao = getInt();
			if (decisao == 1) {
				criarLivro(livroList);
			} else if (decisao == 2) {
				listarLivros(livroList);
			} else if (decisao == 3) {
				apagarLivro(livroList);
			} else if (decisao == 4) {
				editarLivro(livroList);
			} else {
				break;
			}
		}
	}

	private static void exibeMenu() {
		System.out.println("--Menu--");
		System.out.println("1 - Criar Livro");
		System.out.println("2 - Listar Livros");
		System.out.println("3 - Apagar Livro");
		System.out.println("4 - Editar Livro");
	}

	private static void editarLivro(ArrayList<Livro> livroList) {
		listarLivros(livroList);
		System.out.println("Digite o titulo do livro que deseja editar?");
		String tituloProcurado = scanner.nextLine();
		Livro livroSelecionado = encontraLivroPorNome(livroList, tituloProcurado);

		System.out.println("Digite o titulo:");
		String titulo = scanner.nextLine();
		System.out.println("Digite a qtdPaginas: ");
		int qtdPaginas = getInt();
		
		livroSelecionado.setTitulo(titulo);
		livroSelecionado.setQtdPaginas(qtdPaginas);

	}

	private static Livro encontraLivroPorNome(ArrayList<Livro> livroList, String tituloProcurado) {
		for (Livro livro : livroList) {
			if (livro.getTitulo().equals(tituloProcurado)) {
				return livro;
			}
		}
		return null;
	}

	private static void apagarLivro(ArrayList<Livro> livroList) {
		listarLivros(livroList);
		System.out.println("Qual livro deseja apagar?");
		int indice = getInt();
		livroList.remove(indice);

	}

	private static void listarLivros(ArrayList<Livro> livroList) {
		System.out.println("Listando livros");
		for (Livro livro : livroList) {
			livro.exibeInformacoes(livroList);
		}
		System.out.println();
	}

	private static void criarLivro(ArrayList<Livro> livroList) {
		System.out.println("qtdPaginas: ");
		int qtdPaginas = getInt();
		System.out.println("Titulo: ");
		String titulo = scanner.nextLine();
		Livro livro = new Livro(titulo, qtdPaginas);
		livroList.add(livro);
	}

	private static int getInt() {
		int a = scanner.nextInt();
		scanner.nextLine();
		return a;
	}

}
