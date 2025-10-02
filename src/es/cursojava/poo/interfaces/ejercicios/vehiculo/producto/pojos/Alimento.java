package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

public abstract class Alimento extends Producto {

	private String fechaCaducidad;

	public Alimento(long id, String nombre, double precio, String fechaCaducidad) {
		super(id, nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
}
