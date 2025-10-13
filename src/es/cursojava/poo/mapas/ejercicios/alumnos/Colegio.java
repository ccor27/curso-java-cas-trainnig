package es.cursojava.poo.mapas.ejercicios.alumnos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.cursojava.poo.Alumno;

public class Colegio {

	private String nombre;
	private String direccion;
	Map<String, List<Alumno>> aulas;

	public Colegio(String nombre, String direccion, Map<String, List<Alumno>> aulas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = aulas;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public void mostrarCantidadAulas() {
		System.out.println("El numero de aulas que hay es: " + this.aulas.size());
	}

	public void mostrarDatosDeAlumosPorAula() {
		if (!aulas.isEmpty()) {
			Set<Entry<String, List<Alumno>>> entries = aulas.entrySet();
			for (Entry<String, List<Alumno>> entry : entries) {
				List<Alumno> alumnos = entry.getValue();
				String aula = entry.getKey();
				System.out.println("El aula: " + aula + " tiene los alumnos:");
				for (Alumno alumno : alumnos) {
					if (alumno != null) {
						System.out.println(alumno.toString());
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("El colegio no tiene aulas");
		}
	}

	public void mostrarCantidadAlumnosPorAula() {
		if (!aulas.isEmpty()) {
			Set<Entry<String, List<Alumno>>> entries = aulas.entrySet();
			for (Entry<String, List<Alumno>> entry : entries) {
				List<Alumno> alumnos = entry.getValue();
				String aula = entry.getKey();
				System.out.println("El aula: " + aula + " tiene la cantidad de alumnos: " + alumnos.size());
			}
		} else {
			System.out.println("El colegio no tiene aulas");
		}
	}

	public void mostrarAlumnosDeUnAula(String nombre) {
		if (!aulas.isEmpty()) {
			if (aulas.containsKey(nombre)) {
				List<Alumno> alumnos = aulas.get(nombre);
				for (Alumno alumno : alumnos) {
					if (alumno != null) {
						System.out.println(alumno.toString());
					}
				}
			} else {
				System.out.println("El aula que busca no existe");
			}
		} else {
			System.out.println("El colegio no tiene aulas");
		}
	}

	public void mostrarAulaConElAlumnoConMasNotaMedia() {

		Map<String, Double> mayorNotaMedia = new HashMap();
		Set<Entry<String, List<Alumno>>> entries = aulas.entrySet();
		for (Entry<String, List<Alumno>> entry : entries) {
			List<Alumno> alumnos = entry.getValue();
			String aula = entry.getKey();
			mayorNotaMedia.put(aula, obtenerMayorNotaMediaPorAula(alumnos));
		}
		elegirMayorNota(mayorNotaMedia);
	}

	private double obtenerMayorNotaMediaPorAula(List<Alumno> alumnos) {
		double notaMayor = 0;
		for (Alumno alumno : alumnos) {
			if (alumno != null) {
				if (alumno.getNotaMedia() > notaMayor) {
					notaMayor = alumno.getNotaMedia();
				}
			}
		}
		return notaMayor;
	}

	private void elegirMayorNota(Map<String, Double> notas) {
		double notaMaxima = 0;
		String aula = "";
		Set<Entry<String, Double>> entries = notas.entrySet();
		for (Entry<String, Double> entry : entries) {
			if (entry.getValue() > notaMaxima) {
				notaMaxima = entry.getValue();
				aula = entry.getKey();
			}
		}
		System.out.println(aula + " tiene el alumno con la nota media mas alta");
	}
	
	public void mostrarDatosColegio() {
		System.out.println(this.nombre);
		System.out.println(this.direccion);
		mostrarDatosDeAlumosPorAula();
	}
}
