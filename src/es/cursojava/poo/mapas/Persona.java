package es.cursojava.poo.mapas;

public class Persona {

	private String nombre;
	private String dni;

	public Persona(String nombre,String dni) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public Persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
