package es.cursojava.poo.interfaces.ejercicios.vehiculo.producto.pojos;

public abstract class Objeto {

	private long id;
	
	public Objeto(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
