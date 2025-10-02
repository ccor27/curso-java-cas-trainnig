package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

public abstract class Producto extends Objeto{

	private String nombre;
	private double precio;	

	public Producto(long id, String nombre, double precio) {
		super(id);
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
