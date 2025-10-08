package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos;

import java.time.LocalDate;

public class Yogurt extends Lacteo {

	private LocalDate fechaProduccion;

	public Yogurt(String nombre, int cantidad, double precioPorMl, LocalDate caducidad, 
			LocalDate fechaProduccion) {
		super(nombre, cantidad, precioPorMl, caducidad);
		this.fechaProduccion = fechaProduccion;
	}

	
	public LocalDate getFechaProduccion() {
		return fechaProduccion;
	}


	public void setFechaProduccion(LocalDate fechaProduccion) {
		this.fechaProduccion = fechaProduccion;
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
		// TODO Auto-generated method stub
		return cantidad * getPrecioPorMl();
	}
	
}
