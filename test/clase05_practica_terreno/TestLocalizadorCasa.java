package clase05_practica_terreno;

import org.junit.Assert;
import org.junit.Test;

public class TestLocalizadorCasa {

	LocalizadorCasa localizador = new LocalizadorCasa();

	@Test
	public void testCasaTrivialTerrenoTrivial(){
		
		int[][] casa = {{1}};
		int[][] terreno = {{0}};
		
		Posicion posicion = localizador.sonCompatibles(terreno, casa);
		Assert.assertTrue(posicion.isEntra());
		Assert.assertEquals(0, posicion.getPosicionX());
		Assert.assertEquals(0, posicion.getPosicionY());
		
	}
	
	@Test
	public void testCasaTrivialTerrenoUnPocoComplejo(){
		
		int[][] casa = {{1}};
		int[][] terreno = {{1,1}, {1,0}};
		
		Posicion posicion = localizador.sonCompatibles(terreno, casa);
		Assert.assertTrue(posicion.isEntra());
		Assert.assertEquals(1, posicion.getPosicionX());
		Assert.assertEquals(1, posicion.getPosicionY());
		
	}
	
	
	@Test
	public void testCasaTrivialTerrenoComplejo(){
		
		int[][] casa = {{1}};
		int[][] terreno = {{1,1,1}, {1,0,1}, {0,1,1}};
		
		Posicion posicion = localizador.sonCompatibles(terreno, casa);
		Assert.assertTrue(posicion.isEntra());
		Assert.assertEquals(2, posicion.getPosicionX());
		Assert.assertEquals(0, posicion.getPosicionY());
		
	}
	
	@Test
	public void testCasaQueNoEsCompatible(){

		int[][] casa = {{1, 1, 1}};
		int[][] terreno = {{1,1,1}, {1,0,1}, {0,1,1}};
		
		Posicion posicion = localizador.sonCompatibles(terreno, casa);
		Assert.assertNull(posicion);
		
	}
	
}
