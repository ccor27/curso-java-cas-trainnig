package es.cursojava.poo.exception.ejercicios.ejercicio2.pojos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comensal extends ClienteTomaCafe {


	private boolean tieneReserva;

	public Comensal(String nombre, boolean tieneReserva) {
		super(nombre);
		this.tieneReserva = tieneReserva;
	}
	

}
