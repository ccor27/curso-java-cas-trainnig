package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class GuitarraElectrica extends Instrumento{

	private int potencia;

	public GuitarraElectrica(String nombre, String tipo, int potencia) {
		super(nombre, tipo);
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
