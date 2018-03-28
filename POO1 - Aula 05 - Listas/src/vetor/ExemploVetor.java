package vetor;

import java.util.Scanner;

public class ExemploVetor {
	public static void main(String[] args) {
		criarVetorEstatico();
		criarVetorDinamico();
	}

	public static void criarVetorEstatico() {
		String[] vetorString = new String[3];
		vetorString[0] = "Kotlin";
		vetorString[1] = "Cobol";
		vetorString[2] = "Python";

		System.out.println("exibicao1");
		for (int i = 0; i < vetorString.length; i++) {
			System.out.println(vetorString[i]);
		}

		System.out.println("\nexibicao2");
		for (String string : vetorString) {
			System.out.println(string);
		}
	}

	public static void criarVetorDinamico() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int tamanhoVetor = scanner.nextInt();
		scanner.nextLine();

		String[] vetorString = new String[tamanhoVetor];

		for (int i = 0; i < vetorString.length; i++) {
			System.out.print("Digite a string " + i + ": ");
			String string = scanner.nextLine();
			vetorString[i] = string;
		}

		for (String string : vetorString) {
			System.out.println(string);
		}

		scanner.close();
	}
}
