package clase06_algoritmos_ordenamiento;

import java.util.Arrays;

public class SeleccionAlumnos extends AlgoritmoOrdenamiento {

	@Override
	public int[] ordenar(int[] original) {

		int[] array = Arrays.copyOf(original, original.length);

		
		int longitud = array.length;
		
		for (int i = longitud - 1; i >= 0; i--){
			int posicionMaximo = 0;
			int vectorMaximo = 0;
			
			for (int j=0; j < i; j++) {
				if (array[j]>vectorMaximo) {
					posicionMaximo = j;
					vectorMaximo = array[j];
				}
			}
			intercambiar(array, i, posicionMaximo);
		}
		
		return array;

	}

}
