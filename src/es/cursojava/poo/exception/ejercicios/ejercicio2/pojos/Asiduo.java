package es.cursojava.poo.exception.ejercicios.ejercicio2.pojos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Asiduo extends ClienteTomaCafe {

	private String mote;
	
	
	public Asiduo(String nombre, String mote) {
		super(nombre);
		this.mote = mote;
	}

}
