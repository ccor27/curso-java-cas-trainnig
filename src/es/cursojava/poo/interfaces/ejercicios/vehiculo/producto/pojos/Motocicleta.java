package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Consultable;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Insertable;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Updatable;

public class Motocicleta extends VehiculoMotorizado implements Consultable, Insertable, Updatable {

	private String tipo;

	public Motocicleta(long id, String motor, String tipo) {
		super(id, motor);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" se esta encendiendo");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
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
		System.out.println(this.getClass().getName()+" se esta insertando (insert)");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" se esta buscando (select)");
	}
	
}
