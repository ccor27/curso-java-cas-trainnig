package es.cursojava.poo;

public class Colegio {

//	private Alumno[] alumnos;
//
//	
//	public Colegio(Alumno[] alumnos) {
//		super();
//		this.alumnos = alumnos;
//	}
	
	public void estudiarAlumnos(Alumno[] alumnos) {
		for (Alumno alumno : alumnos) {
			alumno.estudiar();
		}
	}
//	public Alumno[] getAlumnos() {
//		return alumnos;
//	}
//
//	public void setAlumnos(Alumno[] alumnos) {
//		this.alumnos = alumnos;
//	}
	
}
