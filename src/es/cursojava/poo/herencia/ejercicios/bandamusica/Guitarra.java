package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class Guitarra extends Instrumento{
	
	private int numCuerdas;

	public Guitarra(String nombre, String tipo, int numCuerdas) {
		super(nombre, tipo);
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}
	
	@Override
	public void afinar() {
		super.afinar();
		System.out.println("Afinando Guitarra");
	}

}
