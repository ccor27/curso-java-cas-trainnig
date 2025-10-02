package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Consultable;
import es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.interfaces.Deleteable;

public class Manzana extends Alimento implements Consultable, Deleteable {

	private int peso;
	private String color;
	public Manzana(long id, String nombre, double precio, String fechaCaducidad, int peso, String color) {
		super(id, nombre, precio, fechaCaducidad);
		this.peso = peso;
		this.color = color;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" se esta insertando (insert)");
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" se esta actualizando (update)");
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" se esta eliminando (delete)");		
	}
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName()+" se esta buscando (select)");
		
	}
	
	
}
