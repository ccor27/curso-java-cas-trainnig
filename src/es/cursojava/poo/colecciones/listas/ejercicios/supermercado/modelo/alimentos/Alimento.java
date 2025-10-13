package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos;

public abstract class Alimento {

	private String nombre;
	private int cantidad;

	public Alimento(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean comprar(int cantidadAComprar) {
		if(cantidad < cantidadAComprar) {
			return false;
		}
		cantidad -= cantidadAComprar;
		return true;
	}
	public abstract Alimento clonarConCantidad(int cantidad);

}
