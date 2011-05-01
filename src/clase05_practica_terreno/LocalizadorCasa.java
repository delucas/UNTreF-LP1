package clase05_practica_terreno;

public class LocalizadorCasa {

	
	/**
	 * Este metodo se encargara de evaluar si el terreno y la casa dadas son
	 * compatibles.
	 * @param terreno se asume mas grande que la casa
	 * @param casa se asume mas pequena que el terreno, y se la asume orientada
	 * al norte
	 * @return la posicion donde se ubico, o null en el caso de que no se
	 * haya podido encontrar una posicion para la casa.
	 */
	public Posicion sonCompatibles(int[][] terreno, int[][] casa) {

		Orientacion orientacion = Orientacion.NORTE;
		Posicion resultado = null;

		// variables auxiliares
		int altoTerreno = terreno.length;
		int anchoTerreno = terreno[0].length;

		int altoCasa = casa.length;
		int anchoCasa = casa[0].length;

		for (int rotaciones = 0; rotaciones < 4; rotaciones++) {

			switch (rotaciones) {
			case 0:
				orientacion = Orientacion.NORTE;
				break;
			case 1:
				orientacion = Orientacion.OESTE;
				break;
			case 2:
				orientacion = Orientacion.SUR;
				break;
			case 3:
				orientacion = Orientacion.ESTE;
				break;
			}
			
			// pruebo para cada posicion de los bordes del terreno

			// borde superior
			int filaTerreno = 0;
			resultado = probarPorFila(filaTerreno, terreno, casa, orientacion);

			// si se pudo ubicar la casa, se deja de buscar
			if (resultado !=  null) {
				return resultado;
			}
			
			// borde superior
			filaTerreno = altoTerreno - altoCasa;
			resultado = probarPorFila(filaTerreno, terreno, casa, orientacion);

			// si se pudo ubicar la casa, se deja de buscar
			if (resultado !=  null) {
				return resultado;
			}
			
			// lateral izquierdo
			int columnaTerreno = 0;
			resultado = probarPorColumna(columnaTerreno, terreno, casa, orientacion);
			
			// si se pudo ubicar la casa, se deja de buscar
			if (resultado !=  null) {
				return resultado;
			}
			
			// lateral derecho
			columnaTerreno = anchoTerreno - anchoCasa;
			resultado = probarPorColumna(columnaTerreno, terreno, casa, orientacion);

			// TODO: Como se podria hacer para evitar la repeticion de este codigo?
			// si se pudo ubicar la casa, se deja de buscar
			if (resultado !=  null) {
				return resultado;
			}

			// casa = rotarIzquierda(casa);
			// TODO: este codigo tiene un error. Quien lo corrige?

		}
		
		return null;
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

	private Posicion probarPorFila(int filaTerreno, int[][] terreno,
			int[][] casa, Orientacion orientacion) {
		// asumo que entra
		boolean entra = true;
		// variables auxiliares
		int anchoTerreno = terreno[0].length;
		int altoCasa = casa.length;
		int anchoCasa = casa[0].length;

		for (int columnaTerreno = 0; columnaTerreno <= anchoTerreno - anchoCasa; columnaTerreno++) {

			// cada posicion de la casa
			for (int filaCasa = 0; filaCasa < altoCasa; filaCasa++) {
				for (int columnaCasa = 0; columnaCasa < anchoCasa; columnaCasa++) {
					// si no entra
					if (entra
							&& (terreno[filaTerreno + filaCasa][columnaTerreno
									+ columnaCasa] == 1)
							&& (casa[filaCasa][columnaCasa] == 1)) {
						entra = false;
					}
				}
			}

			// si entra
			if (entra) {
				return new Posicion(true, filaTerreno, columnaTerreno,
						orientacion);
			} else {
				entra = true;
			}

		}

		// si no puede hacerse entrar
		return null;

	}

	private Posicion probarPorColumna(int columnaTerreno, int[][] terreno,
			int[][] casa, Orientacion orientacion) {
		// asumo que entra
		boolean entra = true;
		// variables auxiliares
		int altoTerreno = terreno.length;
		int altoCasa = casa.length;
		int anchoCasa = casa[0].length;

		for (int filaTerreno = 0; filaTerreno <= altoTerreno - altoCasa; filaTerreno++) {

			// cada posicion de la casa
			for (int filaCasa = 0; filaCasa < altoCasa; filaCasa++) {
				for (int columnaCasa = 0; columnaCasa < anchoCasa; columnaCasa++) {
					// si no entra
					if (entra
							&& (terreno[filaTerreno + filaCasa][columnaTerreno
									+ columnaCasa] == 1)
							&& (casa[filaCasa][columnaCasa] == 1)) {
						entra = false;
					}
				}
			}

			// si entra
			if (entra) {
				return new Posicion(true, filaTerreno, columnaTerreno,
						orientacion);
			} else {
				entra = true;
			}

		}

		// si no puede hacerse entrar
		return null;

	}

}
