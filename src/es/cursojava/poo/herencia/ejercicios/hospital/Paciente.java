package es.cursojava.poo.herencia.ejercicios.hospital;

public class Paciente extends Persona {

	private String[] sintomas;

	public Paciente(String nombre,int edad,String[] sintomas) {
		super(nombre,edad);
		this.sintomas = sintomas;
	}

	public String[] getSintomas() {
		return sintomas;
	}

	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}
	
	
	
	@Override
	public void comer() {
	System.out.println("Paciente "+this.getNombre()+" comiendo en la cafeteria");	
	}
	
}
