package es.cursojava.hibernate.ejercicios.curso.exception;

import java.util.HashMap;
import java.util.Map;

public class CustomException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	 Map<String, String> errors;
	public CustomException(String message, Map<String, String> errors) {
		super();
		this.message = message;
		this.errors = errors;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
	public Map<String, String> getErrors() {
		return errors;
	}
}
