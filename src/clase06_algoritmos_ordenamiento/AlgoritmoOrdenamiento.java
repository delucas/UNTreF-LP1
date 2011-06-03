package clase06_algoritmos_ordenamiento;

public abstract class AlgoritmoOrdenamiento {

	public abstract int[] ordenar (int[] array);

	protected void intercambiar(int[] array, int i, int j) {
		int auxiliar = array[i];
		array[i] = array[j];
		array[j] = auxiliar;
		
	}
	
}
