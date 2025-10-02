package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

public class Bicicleta extends Vehiculo {

	int numMarchas;

	public Bicicleta(long id, int numMarchas) {
		super(id);
		this.numMarchas = numMarchas;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	
}
