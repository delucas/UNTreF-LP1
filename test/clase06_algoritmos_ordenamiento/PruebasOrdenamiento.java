package clase06_algoritmos_ordenamiento;

import org.junit.Assert;
import org.junit.Test;


public class PruebasOrdenamiento {

	int [] original = {2, 3, 1, 5, 4, 8, 6, 7, 9};
	int [] control = {1,2,3,4,5,6,7,8,9};

	@Test
	public void testBurbujeoAlumnos(){
		
		AlgoritmoOrdenamiento algoritmo = new BurbujeoAlumnos();
		int[] actual = algoritmo.ordenar(original);
		
		Assert.assertArrayEquals(control, actual);
	}
	
	@Test
	public void testBurbujeo(){
		
		AlgoritmoOrdenamiento algoritmo = new Burbujeo();
		int[] actual = algoritmo.ordenar(original);
		
		Assert.assertArrayEquals(control, actual);
	}
	
	@Test
	public void testSeleccion(){
		
		AlgoritmoOrdenamiento algoritmo = new Seleccion();
		int[] actual = algoritmo.ordenar(original);
		
		Assert.assertArrayEquals(control, actual);
	}
	
	@Test
	public void testSeleccionAlumnos(){
		
		AlgoritmoOrdenamiento algoritmo = new SeleccionAlumnos();
		int[] actual = algoritmo.ordenar(original);
		
		Assert.assertArrayEquals(control, actual);
	}

	@Test
	public void testInsercion(){
		
		AlgoritmoOrdenamiento algoritmo = new Insercion();
		int[] actual = algoritmo.ordenar(original);
		
		Assert.assertArrayEquals(control, actual);
	}
	
	@Test
	public void testInsercionAlumnos(){
		
		AlgoritmoOrdenamiento algoritmo = new InsercionAlumnos();
		int[] actual = algoritmo.ordenar(original);
		
		Assert.assertArrayEquals(control, actual);
	}
	
}
