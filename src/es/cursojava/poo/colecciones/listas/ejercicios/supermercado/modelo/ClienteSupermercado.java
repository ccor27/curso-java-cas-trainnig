package es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.poo.colecciones.listas.ejercicios.supermercado.modelo.alimentos.Alimento;

public class ClienteSupermercado extends Persona {

	private List<Alimento> carritoDeCompra;

	public ClienteSupermercado(String nombre, int edad) {
		super(nombre, edad);
		this.carritoDeCompra = new ArrayList<Alimento>();
	}

	public List<Alimento> getCarritoDeCompra() {
		return carritoDeCompra;
	}

	public void setCarritoDeCompra(List<Alimento> carritoDeCompra) {
		this.carritoDeCompra = carritoDeCompra;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	public void añadirAlimento(Alimento alimento) {
		this.carritoDeCompra.add(alimento);
	}
	
	
}
