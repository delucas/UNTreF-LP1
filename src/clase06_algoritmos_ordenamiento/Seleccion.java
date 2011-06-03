package clase06_algoritmos_ordenamiento;

import java.util.Arrays;

public class Seleccion extends AlgoritmoOrdenamiento {

	@Override
	public int[] ordenar(int[] original) {

		int[] array = Arrays.copyOf(original, original.length);

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					// ... Exchange elements
					intercambiar(array, i, j);
				}
			}
		}

		return array;

	}

}
