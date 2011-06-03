package clase06_algoritmos_ordenamiento;

import java.util.Arrays;

public class Burbujeo extends AlgoritmoOrdenamiento {

	@Override
	public int[] ordenar(int[] original) {

		int[] array = Arrays.copyOf(original, original.length);

		int n = array.length;
		for (int pass = 1; pass < n; pass++) { // count how many times
			// This next loop becomes shorter and shorter
			for (int i = 0; i < n - pass; i++) {
				if (array[i] > array[i + 1]) {
					// exchange elements
					intercambiar(array, i, i + 1);
				}
			}
		}

		return array;

	}

}
