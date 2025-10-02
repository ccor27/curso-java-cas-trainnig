package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto;

import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos.Autobus;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos.Bicicleta;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos.Manzana;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos.Motocicleta;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos.Ordenador;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos.Pan;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos.Televisor;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.utilidades.Utilidades;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manzana manzana = new Manzana(1L, "Manzana", 2.50, "12-11-25", 3, "verde");
		Pan pan = new Pan(1L, "pan", 1.50, "20-10-25", 4, "clasico");
		Ordenador ordenador = new Ordenador(1L, "Ordenador Portátil Lenovo", 899.99, "2022-06-15", "Lenovo");
		Televisor televisor = new Televisor(2L, "Smart TV Samsung 55\"", 1299.50, "2023-11-10", 55);
		Autobus autobus = new Autobus(3L, "Motor Diesel Euro6", 50);
		Motocicleta motocicleta = new Motocicleta(4L, "Motor 250cc", "Deportiva");
		Bicicleta bicicleta = new Bicicleta(5L, 21);

		Utilidades.selectObject(manzana);
		Utilidades.insertObject(motocicleta);
		Utilidades.updateObject(televisor);
		Utilidades.deleteObject(manzana);
		
		
	}

}
