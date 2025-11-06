package es.cursojava.poo.exception.ejercicios.ejercicio2.interfaces;

import es.cursojava.poo.exception.ejercicios.ejercicio2.exceptions.TooColdTemperatureException;
import es.cursojava.poo.exception.ejercicios.ejercicio2.exceptions.TooHotTemperatureException;
import es.cursojava.poo.exception.ejercicios.ejercicio2.pojos.TazaCafe;

public interface Tomable {

	void tomar(TazaCafe cafe)throws TooColdTemperatureException, TooHotTemperatureException, NullPointerException;
}
