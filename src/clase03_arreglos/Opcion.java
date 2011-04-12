package clase03_arreglos;

public class Opcion {

	int numero;
	String texto;
	int cantidadVotos;

	public Opcion(int numero, String texto) {
		this.numero = numero;
		this.texto = texto;
	}

	public int getVotos(){
		return this.cantidadVotos;
	}
	
	public void votar(){
		this.cantidadVotos++;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
