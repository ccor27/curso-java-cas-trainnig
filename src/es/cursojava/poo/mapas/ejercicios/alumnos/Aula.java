package es.cursojava.poo.mapas.ejercicios.alumnos;

import java.util.List;

import es.cursojava.poo.Alumno;

public class Aula {

	private String nombre;
	private List<Alumno> alumnos;

	public Aula(String nombre, List<Alumno> alumnos) {
		super();
		this.nombre = nombre;
		this.alumnos = alumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void mostrarDatosDeAlumnos() {
		for (Alumno alumno : alumnos) {
			if(alumno!=null) {
				System.out.println(alumno.toString());
			}
		}
	}

}
