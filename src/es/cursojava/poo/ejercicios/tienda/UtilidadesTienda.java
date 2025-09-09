package es.cursojava.poo.ejercicios.tienda;

public class UtilidadesTienda {
	
	public static double calculateInventaryValue(Producto[] productos) {
		double value = 0.0;
		for (Producto producto : productos) {
			value += producto.calculateTotalValue();
		}
		return value;
	}

}
