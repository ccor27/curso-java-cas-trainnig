package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class GuitarraElectrica extends Instrumento{

	private int potencia;

	public GuitarraElectrica(String nombre, String tipo, boolean afinado, int potencia) {
		super(nombre, tipo, afinado);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void tocar() {
		System.out.println("Tocando muy alto");
	}
}
