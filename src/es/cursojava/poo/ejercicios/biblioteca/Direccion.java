package es.cursojava.poo.ejercicios.biblioteca;

public class Direccion {

	private String calle;
	private String ciudad;
	private int codigoPostal;

	public Direccion(String calle, String ciudad, int codigoPostal) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public void mostrarDireccion() {
		System.out.println("Direccion: "+
	                       "\n  - calle: "+this.calle+
	                       "\n  - ciudad: "+this.ciudad+
	                       "\n  - codigo postal: "+this.codigoPostal+
	                       "\n");
	}
}
