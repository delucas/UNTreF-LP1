package clase02_pruebas;

import junit.framework.Assert;

import org.junit.Test;

import clase02_pruebas.Calculadora;

public class CalculadoraTest {
	
	@Test
	public void testDividirPositivos(){
		// preparación
		Calculadora calculadora = new Calculadora();
		int dividendo = 1;
		int divisor = 1;
		int resultadoEsperado = 1;
		
		// ejecución
		int resultado = calculadora.dividir(dividendo, divisor);
		
		// comprobación
		Assert.assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testDividirNegativos(){
		// preparación
		Calculadora calculadora = new Calculadora();
		int dividendo = -1;
		int divisor = -1;
		int resultadoEsperado = 1;
		
		// ejecución
		int resultado = calculadora.dividir(dividendo, divisor);
		
		// comprobación
		Assert.assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testDividirElementoAbsorbente(){
		// preparación
		Calculadora calculadora = new Calculadora();
		int dividendo = 3;
		int divisor = 3;
		int resultadoEsperado = 1;
		
		// ejecución
		int resultado = calculadora.dividir(dividendo, divisor);
		
		// comprobación
		Assert.assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testDividirPositivosDistintosDeUno(){
		// preparación
		Calculadora calculadora = new Calculadora();
		int dividendo = 10;
		int divisor = 5;
		int resultadoEsperado = 2;
		
		// ejecución
		int resultado = calculadora.dividir(dividendo, divisor);
		
		// comprobación
		Assert.assertEquals(resultadoEsperado, resultado);
	}
	
}
