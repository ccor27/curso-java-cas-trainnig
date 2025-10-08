package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos;

import java.time.LocalDate;

public class Leche extends Lacteo {

	private LocalDate fechaOrdeno;

	public Leche(String nombre, int cantidad, double precioPorMl, LocalDate caducidad, LocalDate fecha_ordeno) {
		super(nombre, cantidad, precioPorMl, caducidad);
		this.fechaOrdeno = fecha_ordeno;
	}

	public void setFecha_ordeno(LocalDate fecha_ordeno) {
		this.fechaOrdeno = fecha_ordeno;
	}

	@Override
	public String obtenerFechaCaducidad() {
		return getCaducidad().toString();
	}

	@Override
	public boolean estaCaducado() {
		return LocalDate.now().isAfter(getCaducidad());
	}

	@Override
	public double calcularPrecioTotal(double cantidad) {
		return cantidad * getPrecioPorMl();
	}
	
	
}
