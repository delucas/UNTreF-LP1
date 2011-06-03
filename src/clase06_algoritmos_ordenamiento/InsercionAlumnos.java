package clase06_algoritmos_ordenamiento;

import java.util.Arrays;

public class InsercionAlumnos extends AlgoritmoOrdenamiento {

	@Override
	public int[] ordenar(int[] original) {

		int[] array = Arrays.copyOf(original, original.length);

		for ( int i = 1; i < array.length; i++) {
			if (array[i] < array [i - 1]){
				for (int j = 0; j <= array.length; j++) {
					if (array[i] < array[j]) {
						for (int r = j; r < i; r++) {
							intercambiar(array, r, r+1);
						}
					}
				}
			}
		}

		return array;

	}

}
