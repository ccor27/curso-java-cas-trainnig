package es.cursojava.poo.exception.ejercicios.ejercicio2.pojos;

import es.cursojava.poo.exception.ejercicios.ejercicio2.exceptions.TooColdTemperatureException;
import es.cursojava.poo.exception.ejercicios.ejercicio2.exceptions.TooHotTemperatureException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteTomaCafe extends Cliente {
	
	private final int MAX_TMEPERATURE = 80;
	private final int MIN_TMEPERATURE = 20;

	public ClienteTomaCafe(String nombre) {
		super(nombre);
	}

	public void tomar(TazaCafe cafe) throws TooColdTemperatureException, TooHotTemperatureException, NullPointerException {
		if(cafe !=null) {
			if(cafe.getTemperatura() > MAX_TMEPERATURE) {
				throw new TooHotTemperatureException("El cliente "+getNombre()+" se queja de que su cafe esta muy caliente!.");
			} else if(cafe.getTemperatura() < MIN_TMEPERATURE) {
				throw new TooColdTemperatureException("El cliente "+getNombre()+" se queja de que su cafe esta frio!.");
			}else {
				System.out.println("El cliente "+getNombre()+" esta feliz con su bebida!");
			}
			
		}else {
			throw new NullPointerException("El cliente "+getNombre()+" no tiene su taza de cafe, no puede beber!");
		}
	}
}