package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos;

import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.interfaces.Calculable;

public abstract class Carne extends Alimento implements Calculable {

	private double precioPorKg;
	private String origen;

	public Carne(String nombre, int cantidad, double precioPorKg, String origen) {
		super(nombre, cantidad);
		this.precioPorKg = precioPorKg;
		this.origen = origen;
	}

	public double getPrecioPorKg() {
		return precioPorKg;
	}

	public void setPrecioPorKg(double precioPorKg) {
		this.precioPorKg = precioPorKg;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

}
