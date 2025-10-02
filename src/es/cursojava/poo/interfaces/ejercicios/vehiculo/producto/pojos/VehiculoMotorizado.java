package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Apagable;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Encendible;

public abstract class VehiculoMotorizado extends Vehiculo implements Encendible, Apagable {

	private String motor;

	public VehiculoMotorizado(long id, String motor) {
		super(id);
		this.motor = motor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
}
