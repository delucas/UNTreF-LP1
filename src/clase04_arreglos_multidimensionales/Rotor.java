package clase04_arreglos_multidimensionales;

public class Rotor {

	public int[][] rotar(int[][] miMatriz, Direcciones direccion) {

		if (direccion == Direcciones.IZQUIERDA) {
			miMatriz = rotarIzquierda(miMatriz);
		}

		if (direccion == Direcciones.CIENTO_OCHENTA) {
			miMatriz = rotarIzquierda(miMatriz);
			miMatriz = rotarIzquierda(miMatriz);
		}

		if (direccion == Direcciones.DERECHA) {
			miMatriz = rotarIzquierda(miMatriz);
			miMatriz = rotarIzquierda(miMatriz);
			miMatriz = rotarIzquierda(miMatriz);
		}

		return miMatriz;

	}

	private int[][] rotarIzquierda(int[][] miMatriz) {
		
		int cantidadFilasMatrizOrigen = miMatriz.length;
		int cantidadColumnasMatrizOrigen = miMatriz[0].length;
		
		int [][] aux = new int[cantidadColumnasMatrizOrigen][cantidadFilasMatrizOrigen];
		
		for (int i=0; i<miMatriz.length; i++){
			for (int j=0; j<miMatriz[i].length; j++){
				aux[aux[i].length - j - 1 ][i] = miMatriz[i][j]; 
			}
		}
		return aux;
		
	}

}
