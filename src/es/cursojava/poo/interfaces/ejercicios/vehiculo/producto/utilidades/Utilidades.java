package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.utilidades;

import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Consultable;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Deleteable;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Insertable;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Updatable;

public class Utilidades {

	
	public static void selectObject(Consultable consultable) {
		consultable.select();
	}
	public static void insertObject(Insertable insertable) {
		insertable.insert();
	}
	public static void updateObject(Updatable updatable) {
		updatable.update();
	}
	public static void deleteObject(Deleteable deleteable) {
		deleteable.delete();
	}
}
