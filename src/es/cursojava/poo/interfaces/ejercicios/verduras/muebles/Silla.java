package es.cursojava.poo.interfaces.ejercicios.verduras.muebles;

public class Silla extends Mueble implements Limpiable{

	private String material;

	public Silla(String color, String material) {
		super(color);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void limpiar() {
		System.out.println("Limpiando silla");
		
	}
	
	
}
