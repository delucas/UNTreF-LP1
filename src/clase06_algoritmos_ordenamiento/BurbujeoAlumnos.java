package clase06_algoritmos_ordenamiento;

import java.util.Arrays;

public class BurbujeoAlumnos extends AlgoritmoOrdenamiento {

	@Override
	public int[] ordenar(int[] original) {
		
		int [] array = Arrays.copyOf(original, original.length);
		
		int i = 0;
		for (int j = array.length; j > i; j--){
			for (i = 0; i < j; i++){
				if (array[i] > array[i+1]){
					intercambiar(array, i, i+1);
				}
			}
		}
		
		return array;
		
	}

}
