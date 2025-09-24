package es.cursojava.poo.herencia.ejercicios.hospital;

public class Enfermero extends EmpleadoHospital{

	private String planta;

	public Enfermero(String nombre, int edad, String turno, String planta) {
		super(nombre, edad, turno);
		this.planta = planta;
	}

	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}
	
	public void atenderPaciente() {
		System.out.println("El enfermero "+this.getNombre()+" esta atendiendo a un paciente!");
	}
}
