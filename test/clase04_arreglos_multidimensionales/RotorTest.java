package clase04_arreglos_multidimensionales;

import org.junit.Assert;
import org.junit.Test;

public class RotorTest {

	private int[][] miMatriz = { { 1, 2 }, { 3, 4 } };
	private Rotor miRotor = new Rotor();
	@Test public void queUnaMatrizRoteALaDerecha(){
		int [][] matrizEsperada = {{3, 1},{4, 2}};
		int [][] matrizObtenida = miRotor .rotar(miMatriz, Direcciones.DERECHA); 
		Assert.assertArrayEquals(matrizEsperada, matrizObtenida);
	}
	@Test public void queUnaMatrizRoteALaIzquierda(){
		int [][] matrizEsperada = {{2, 4},{1, 3}};
		int [][] matrizObtenida = miRotor .rotar(miMatriz, Direcciones.IZQUIERDA); 
		Assert.assertArrayEquals(matrizEsperada, matrizObtenida);
	}
	@Test public void queUnaMatrizRote180Grados(){
		int [][] matrizEsperada = {{4, 3},{2, 1}};
		int [][] matrizObtenida = miRotor .rotar(miMatriz, Direcciones.CIENTO_OCHENTA); 
		Assert.assertArrayEquals(matrizEsperada, matrizObtenida);
	}
}
