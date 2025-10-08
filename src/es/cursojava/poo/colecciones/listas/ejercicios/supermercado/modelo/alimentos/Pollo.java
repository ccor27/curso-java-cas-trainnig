package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos;

public class Pollo extends Carne {

	private String parte;
	private double peso;
	public Pollo(String nombre, int cantidad, double precioPorKg, String origen, String parte, double peso) {
		super(nombre, cantidad, precioPorKg, origen);
		this.parte = parte;
		this.peso = peso;
	}
	public String getParte() {
		return parte;
	}
	public void setParte(String parte) {
		this.parte = parte;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * cantidad es el numero de partes que llevara el cliente
	 */
	@Override
	public double calcularPrecioTotal(double cantidad) {
		// TODO Auto-generated method stub
		return cantidad * (getPrecioPorKg() * getPeso());
	}
	
	
}
