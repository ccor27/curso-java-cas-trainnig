package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

public class Autobus extends VehiculoMotorizado {

	private int capacidad;

	public Autobus(long id, String motor, int capacidad) {
		super(id, motor);
		this.capacidad = capacidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
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
	
}
