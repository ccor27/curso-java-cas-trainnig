package es.cursojava.spring.ejercicio1.pojos;

public class User {

	private String name;
	private Rol rol;

	public User(String name, Rol rol) {
		super();
		this.name = name;
		this.rol = rol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}
