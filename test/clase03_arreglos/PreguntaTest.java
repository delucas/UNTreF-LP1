package clase03_arreglos;

import junit.framework.Assert;

import org.junit.Test;

import clase03_arreglos.Pregunta;

public class PreguntaTest {

	@Test
	public void quePuedoInicializarLaPregunta(){
		// setUp
		String[] opciones = {"Opcion1", "Opcion2", "Opcion3"};
		
		// execute
		Pregunta pregunta = new Pregunta("Pregunta?", opciones );
		
		// contrast
		Assert.assertEquals("Opcion1", pregunta.getOpcion(0).getTexto());
		Assert.assertEquals("Opcion2", pregunta.getOpcion(1).getTexto());
		Assert.assertEquals("Opcion3", pregunta.getOpcion(2).getTexto());
	}

	@Test
	public void quePuedoVotarOpciones(){
		// setUp
		String[] opciones = {"Opcion1", "Opcion2", "Opcion3"};
		Pregunta pregunta = new Pregunta("Pregunta?", opciones );
		
		// execute
		pregunta.getOpcion(0).votar();
		
		// contrast
		Assert.assertEquals(1, pregunta.getOpcion(0).getVotos());
		Assert.assertEquals(0, pregunta.getOpcion(1).getVotos());
		Assert.assertEquals(0, pregunta.getOpcion(2).getVotos());
	}
	
	@Test
	public void quePuedoEncontrarLaCantidadDeOpcionesConMasVotosQueUnaCantidadDada(){
		// setUp
		String[] opciones = {"Opcion1", "Opcion2", "Opcion3"};
		Pregunta pregunta = new Pregunta("Pregunta?", opciones );
		
		// execute
		pregunta.getOpcion(0).votar();
		pregunta.getOpcion(0).votar();
		pregunta.getOpcion(0).votar();
		pregunta.getOpcion(1).votar();
		pregunta.getOpcion(1).votar();
		pregunta.getOpcion(2).votar();
		
		// contrast
		Assert.assertEquals(0, pregunta.contarOpcionesConMasVotos(3));
		Assert.assertEquals(1, pregunta.contarOpcionesConMasVotos(2));
		Assert.assertEquals(2, pregunta.contarOpcionesConMasVotos(1));
	}
	
}
