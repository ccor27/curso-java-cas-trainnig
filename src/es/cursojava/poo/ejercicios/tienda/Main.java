package es.cursojava.poo.ejercicios.tienda;

public class Main {

	public static void main(String[] args) {
		Producto[] productos = new Producto[3];
		Producto producto1 = new Producto("Leche", 1.50, 3);
		productos[0] = producto1;
		Producto producto2 = new Producto("Pan", 0.50, 5);
		productos[1] = producto2;
		Producto producto3 = new Producto("Arroz", 1, 4);
		productos[2] = producto3;

		for (Producto producto : productos) {
			producto.showInfo();
		}
		System.out.println("El valor total del inventario: " + UtilidadesTienda.calculateInventaryValue(productos));
		;
	}
}
