package pojos;

import interfaces.Participable;

public class Jinete extends Persona implements Participable{

	private int aniosExperiencia;

	public Jinete(String nombre, int edad, int aniosExperiencia) {
		super(nombre, edad);
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		return "Jinete \n"
	+"   nombre: "+this.getNombre()
	+"   edad: "+this.getEdad()
	+"   años experiencia: "+aniosExperiencia;
	}

	
}
