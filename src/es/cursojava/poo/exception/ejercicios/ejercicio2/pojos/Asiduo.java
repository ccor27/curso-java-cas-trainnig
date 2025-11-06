package es.cursojava.poo.exception.ejercicios.ejercicio2.pojos;

import es.cursojava.poo.exception.ejercicios.ejercicio2.exceptions.TooColdTemperatureException;
import es.cursojava.poo.exception.ejercicios.ejercicio2.exceptions.TooHotTemperatureException;
import es.cursojava.poo.exception.ejercicios.ejercicio2.interfaces.Tomable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Asiduo extends Cliente implements Tomable {

	private String mote;
	
	
	public Asiduo(String nombre, String mote) {
		super(nombre);
		this.mote = mote;
	}

	@Override
	public void tomar(TazaCafe cafe) throws TooColdTemperatureException, TooHotTemperatureException, NullPointerException {
		if(cafe !=null) {
			if(cafe.getTemperatura() > 80) {
				throw new TooHotTemperatureException("El cliente "+getNombre()+" se queja de que su cafe esta muy caliente!.");
			} else if(cafe.getTemperatura() < 20) {
				throw new TooColdTemperatureException("El cliente "+getNombre()+" se queja de que su cafe esta frio!.");
			}else {
				System.out.println("El cliente "+getNombre()+" esta feliz con su bebida!");
			}
			
		}else {
			throw new NullPointerException("El cliente "+getNombre()+" no tiene su taza de cafe, no puede beber!");
		}
	}
}
