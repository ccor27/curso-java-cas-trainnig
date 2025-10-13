package es.cursojava.poo;

public class Alumno {
	
	private String nombre;
	private String dni;
	private double notaMedia;
	private String[] asignaturas;
	
	
	public Alumno(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	public Alumno(String nombre, String dni, double notaMedia, String[] asignaturas) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.asignaturas = asignaturas;
	}

	public void estudiar() {
		
		System.out.println("El estudiante "+this.nombre+" tiene las asignaturas:");
		for (String asignatura : asignaturas) {
			System.out.println(" -"+asignatura);
		}
		if(notaMedia>9) {
			System.out.println("Es un genio!\n");
		}else if(notaMedia > 5 && notaMedia <= 9 ) {
			System.out.println("Ha estudiado mucho.\n");
		}else {
			System.out.println("Ha estudiado poco.\n");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	@Override
	public String toString() {
		return "nombre: " + nombre + ", dni: " + dni + ", nota media:" + notaMedia;
	}
	
	
	
}