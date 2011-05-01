package clase05_practica_terreno;

public class Posicion {

	private boolean entra;
	private int posicionX;
	private int posicionY;
	private Orientacion orientacion;

	public Posicion(boolean entra, int posicionX, int posicionY,
			Orientacion orientacion) {
		super();
		this.entra = entra;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.orientacion = orientacion;
	}
	
	public boolean isEntra() {
		return entra;
	}
	public void setEntra(boolean entra) {
		this.entra = entra;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	public Orientacion getOrientacion() {
		return orientacion;
	}
	public void setOrientacion(Orientacion orientacion) {
		this.orientacion = orientacion;
	}
	
	
	
}
