package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class Instrumento {
	
	private String nombre;
	private String tipo;
	private boolean afinado;
	
	
	public Instrumento(String nombre, String tipo, boolean afinado) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.afinado = afinado;
	}
	public void afinar() {
		if(Math.random()*10 > 4) {
			this.afinado = true;
		}else {
			this.afinado = false;
		}
	}
	public void tocar() {
		System.out.println("Tocando instrumento "+this.nombre);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isAfinado() {
		return afinado;
	}
	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}

	
}
