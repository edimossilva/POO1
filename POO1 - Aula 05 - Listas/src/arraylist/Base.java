package arraylist;

import java.io.IOException;
import java.util.Scanner;

public class Base {

	/**
	 * Complete the function below. DONOT MODIFY anything outside this function!
	 */
	static int[] rearrange(int[] elements) {
		java.util.List<Integer> elementsList = new java.util.ArrayList<Integer>();
		for (int i : elements) {
			elementsList.add(i);
		}
		java.util.Comparator<Integer> comparator = new java.util.Comparator<Integer>() {

			@Override
			public int compare(Integer int1, Integer int2) {
				String int1binary = Integer.toBinaryString(int1);
				String int2binary = Integer.toBinaryString(int2);
				int cont1 = int1binary.replace("1", "010").split("1").length;
				int cont2 = int2binary.replace("1", "010").split("1").length;

				if (cont1 > cont2) {
					return 1;
				}
				if (cont2 > cont1) {
					return -1;
				} else {
					if (int1 > int2) {
						return 1;
					} else if (int2 > int1) {
						return -1;
					}
					return 0;
				}
			}

		};
		java.util.Collections.sort(elementsList, comparator);
		for (int i = 0; i < elements.length; i++) {
			elements[i] = elementsList.get(i);
		}
		return elements;
	}

	/**
	 * DO NOT MODIFY THIS METHOD!
	 */
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = 0;
		n = Integer.parseInt(in.nextLine().trim());
		int[] elements = new int[n];
		int element;
		for (int i = 0; i < n; i++) {
			element = Integer.parseInt(in.nextLine().trim());
			elements[i] = element;
		}

		// call rearrange function
		int[] results = rearrange(elements);

		for (int i = 0; i < results.length; i++) {
			System.out.println(String.valueOf(results[i]));
		}
	}
}
