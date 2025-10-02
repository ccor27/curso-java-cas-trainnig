package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

public class Pan extends Alimento {

	private int peso;
	private String tipo;
	public Pan(long id, String nombre, double precio, String fechaCaducidad, int peso, String tipo) {
		super(id, nombre, precio, fechaCaducidad);
		this.peso = peso;
		this.tipo = tipo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
