package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class GuitarraElectrica extends Guitarra{

	private int potencia;


	public GuitarraElectrica(String nombre, String tipo, int numCuerdas, int potencia) {
		super(nombre, tipo, numCuerdas);
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
