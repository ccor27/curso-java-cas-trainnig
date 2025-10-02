package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Consultable;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Insertable;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Updatable;

public class Televisor extends ProductoElectronico implements Consultable, Insertable, Updatable {

	private int pulgadas;

	public Televisor(long id, String nombre, double precio, String fechaFabricacion, int pulgadas) {
		super(id, nombre, precio, fechaFabricacion);
		this.pulgadas = pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public void encender() {
		System.out.println(this.getClass().getName()+" se esta encendiendo");
		
	}

	@Override
	public void apagar() {
		System.out.println(this.getClass().getName()+" se esta apagando");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" se esta actualizando (update)");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" esta siendo insertado (insert)");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" se esta buscando (select)");
	}
	
	
}
