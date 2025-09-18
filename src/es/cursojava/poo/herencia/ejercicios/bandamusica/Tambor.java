package es.cursojava.poo.herencia.ejercicios.bandamusica;

public class Tambor extends Instrumento{
	
	private String material;

	public Tambor(String nombre, String tipo, boolean afinado, String material) {
		super(nombre, tipo, afinado);
		this.material = material;
	}
	
	@Override
	public void afinar() {
		this.setAfinado(true);
		System.out.println("Afinando Tambor");
	}
	
	public void aporrear() {
		System.out.println("Aporreando Tambor");
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	

}
