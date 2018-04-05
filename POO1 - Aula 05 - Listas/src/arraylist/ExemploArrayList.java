package arraylist;

import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		String string1 = "Kotlin";
		String string2 = "C#";
		String string3 = "Python";

		ArrayList<String> linguagens = new ArrayList<>();
		linguagens.add(string1);
		linguagens.add(string2);
		linguagens.add(string3);
		linguagens.add("Java");

//		System.out.println("usando toString()");
//		System.out.println(linguagens);

//		System.out.println("\nusando for com int i");
//		for (int i = 0; i < linguagens.size(); i++) {
//			String linguagem = linguagens.get(i);
//			System.out.println(linguagem);
//		}
//
		System.out.println("\nremovendo elemento na posicao 2");
		linguagens.remove(2);

//		System.out.println("\nusando 'foreach'");
//		for (String linguagem : linguagens) {
//			System.out.println("Linguagem: " + linguagem);
//		}

		ArrayList<String> linguagensAntigas = new ArrayList<>();
		linguagensAntigas.add("Cobol");
		linguagensAntigas.add("C");
		linguagensAntigas.add("Delphi");
//
		linguagens.addAll(linguagensAntigas);
		System.out.println("\nusando foreach j8");
		linguagens.forEach(s -> System.out.println(s));

	}
}
