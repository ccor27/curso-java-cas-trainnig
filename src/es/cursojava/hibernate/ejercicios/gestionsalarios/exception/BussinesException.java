package es.cursojava.hibernate.ejercicios.gestionsalarios.exception;

public class BussinesException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public BussinesException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
	
}
