package es.cursojava.hibernate.ejercicios.curso.exception;

public class CustomException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public CustomException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
}
