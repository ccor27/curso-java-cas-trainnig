package es.cursojava.hibernate.ejercicios.onetone.exception;

public class CursoException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public CursoException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
}
