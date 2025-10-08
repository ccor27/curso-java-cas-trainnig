package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos;

import java.time.LocalDate;

import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.interfaces.Perecedero;

public abstract class Lacteo extends Alimento implements Perecedero{

	private double precioPorMl;
	private LocalDate caducidad;

	public Lacteo(String nombre, int cantidad, double precioPorMl, LocalDate caducidad) {
		super(nombre, cantidad);
		this.precioPorMl = precioPorMl;
		this.caducidad = caducidad;
	}

	public double getPrecioPorMl() {
		return precioPorMl;
	}

	public void setPrecioPorMl(double precioPorMl) {
		this.precioPorMl = precioPorMl;
	}

	public LocalDate getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}

}
