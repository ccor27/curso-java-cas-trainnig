package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos;

import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.interfaces.Calculable;

public abstract class Verdura extends Alimento implements Calculable{

	private double precioPorUnidad;
	private String tipo;

	public Verdura(String nombre, int cantidad, double precioPorUnidad, String tipo) {
		super(nombre, cantidad);
		this.precioPorUnidad = precioPorUnidad;
		this.tipo = tipo;
	}

	public double getPrecioPorUnidad() {
		return precioPorUnidad;
	}

	public void setPrecioPorUnidad(double precioPorUnidad) {
		this.precioPorUnidad = precioPorUnidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
