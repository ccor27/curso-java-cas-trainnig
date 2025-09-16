package es.cursojava.poo.herencia;

public class Vaca extends Animal{

	private int numCuernos;

	public Vaca(String nombre, double peso, long identificador, int numCuernos) {
		super(nombre, peso, identificador);
		this.numCuernos = numCuernos;
	}

	public int getNumCuernos() {
		return numCuernos;
	}

	public void setNumCuernos(int numCuernos) {
		this.numCuernos = numCuernos;
	}
	
	public void comer() {
		System.out.println("La vaca "+getNombre()+" esta pastando!");
	}
	public void mugir() {
		System.out.println("La vaca "+getNombre()+" esta mugiendo");
	}
}
