package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos;

public class Cerdo extends Carne {

	private double peso;
	public Cerdo(String nombre, int cantidad, double precioPorKg, String origen, double peso) {
		super(nombre, cantidad, precioPorKg, origen);
		this.peso=peso;
	}

	
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * cantidad es el numero de partes/trozos que llevara el cliente
	 */
	@Override
	public double calcularPrecioTotal(double cantidad) {
		// TODO Auto-generated method stub
		return cantidad * (getPrecioPorKg() * getPeso());
	}
	
}
