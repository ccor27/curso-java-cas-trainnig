package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos;

public class Esparrago extends Verdura {

	private String fechaCosecha;

	public Esparrago(String nombre, int cantidad, double precioPorUnidad, String tipo, String fecha_cosecha) {
		super(nombre, cantidad, precioPorUnidad, tipo);
		this.fechaCosecha = fecha_cosecha;
	}

	public String getFecha_cosecha() {
		return fechaCosecha;
	}

	public void setFecha_cosecha(String fecha_cosecha) {
		this.fechaCosecha = fecha_cosecha;
	}

	@Override
	public double calcularPrecioTotal(double cantidad) {
		
		return cantidad * getPrecioPorUnidad();
	}
	
}
