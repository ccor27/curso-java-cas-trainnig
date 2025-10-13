package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos;

public class Tomate extends Verdura {

	private String color;

	public Tomate(String nombre, int cantidad, double precioPorUnidad, String tipo, String color) {
		super(nombre, cantidad, precioPorUnidad, tipo);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public double calcularPrecioTotal(double cantidad) {
		
		return cantidad * getPrecioPorUnidad();
	}

	@Override
	public Alimento clonarConCantidad(int cantidad) {
		// TODO Auto-generated method stub
		return new Tomate(this.getNombre(), cantidad, this.getPrecioPorUnidad(), this.getTipo(), this.getColor());
	}
}
