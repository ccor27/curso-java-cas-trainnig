package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Consultable;

public class Ordenador extends ProductoElectronico implements Consultable {

	private String marca;

	public Ordenador(long id, String nombre, double precio, String fechaFabricacion, String marca) {
		super(id, nombre, precio, fechaFabricacion);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" se esta insertando (insert)");
	}
	
	
}
