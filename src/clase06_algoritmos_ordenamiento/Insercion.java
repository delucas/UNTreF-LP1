package clase06_algoritmos_ordenamiento;

import java.util.Arrays;

public class Insercion extends AlgoritmoOrdenamiento {

	@Override
	public int[] ordenar(int[] original) {

		int[] array = Arrays.copyOf(original, original.length);

		for (int i = 1; i < array.length; i++) {
			int j = i;
			int B = array[i];
			while ((j > 0) && (array[j - 1] > B)) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = B;
		}

		return array;

	}

}
