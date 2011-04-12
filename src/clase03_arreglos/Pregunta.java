package clase03_arreglos;

public class Pregunta {

	String enunciado;
	Opcion[] opciones;

	public Pregunta(String textoEnunciado, String[] textoOpciones) {
		this.enunciado = textoEnunciado;
		int cantidadOpciones = textoOpciones.length;
		this.opciones = new Opcion[cantidadOpciones];
		int i = 0;
		for (String cadaTexto : textoOpciones){
			this.opciones[i] = new Opcion(i, cadaTexto);
			i++;
		}
	}
	
	public String getEnunciado(){
		return this.enunciado;
	}
	
	public Opcion getOpcion(int numero){
		return this.opciones[numero];
	}
	
	public int contarOpcionesConMasVotos(int cantidadVotos){
		int cantidadConMasVotos = 0;
		for (Opcion cadaOpcion : opciones){
			if (cadaOpcion.getVotos()>cantidadVotos){
				cantidadConMasVotos++;
			}
		}
		return cantidadConMasVotos;
	}
}
