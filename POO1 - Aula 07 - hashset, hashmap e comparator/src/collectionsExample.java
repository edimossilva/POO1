import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class collectionsExample {
	public static void main(String[] args) {
		// hashSetExample();
		// hashMapExample();
		// arrayListintegerExample();
		// arrayListStringExample();
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(new Pessoa("edi", 26, new BigDecimal("1.85")));
		pessoas.add(new Pessoa("mar", 20, new BigDecimal("1.75")));
		pessoas.add(new Pessoa("nat", 18, new BigDecimal("1.60")));
		Collections.sort(pessoas);
		System.out.println(pessoas);
	}

	private static void arrayListStringExample() {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("natali");
		strings.add("antony");
		strings.add("marcelo");
		strings.add("rayc");
		strings.add("gabriel");
		Collections.sort(strings);
		System.out.println(strings);

	}

	public static void arrayListintegerExample() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(541);
		numeros.add(1);
		numeros.add(51);
		numeros.add(54);
		numeros.add(41);
		Collections.sort(numeros);
		System.out.println(numeros);

	}

	public static void hashMapExample() {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("um", 1);
		hashMap.put("zero", 0);
		hashMap.put("numeroGrande", Integer.MAX_VALUE);

		System.out.println(hashMap.get("um"));
		
		HashMap<String, String> pessoa = new HashMap<String, String>();
		pessoa.put("nome", "edimo sousa");
		pessoa.put("idade", "26");
		pessoa.put("altura", "1.85");
		System.out.println(pessoa.get("nome"));
	}

	public static void hashSetExample() {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(1);
		hashSet.add(1);
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(4);
		for (Integer integer : hashSet) {
			System.out.println(integer);

		}
	}
}
