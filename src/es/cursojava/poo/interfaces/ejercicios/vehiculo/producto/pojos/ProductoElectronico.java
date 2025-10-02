package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Apagable;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Encendible;

public abstract class ProductoElectronico extends Producto implements Encendible, Apagable{

	private String fechaFabricacion;

	public ProductoElectronico(long id, String nombre, double precio, String fechaFabricacion) {
		super(id, nombre, precio);
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	
	
}
