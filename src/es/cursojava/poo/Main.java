package es.cursojava.poo;


public class Main {

	public static void main(String[] args) {
		String[] asignaturas = {"Fisica","Quimica","Informatica","Estadistica"};
		Alumno[] alumnos = new Alumno[4];
		Alumno alumno = new Alumno("Jose","682572Q",7.8,asignaturas);
		alumnos[0] = alumno;
		Alumno alumno2 = new Alumno("Andrea","678222A",9.8,asignaturas);
		alumnos[1] = alumno2;
		Alumno alumno3 = new Alumno("Juan","198982W",4.8,asignaturas);
		alumnos[2] = alumno3;
		Alumno alumno4 = new Alumno("Juan","198982W");
		alumnos[3] = alumno4;
		Colegio colegio = new Colegio();
		colegio.estudiarAlumnos(alumnos);
		
//		alumno.estudiar();
//		alumno2.estudiar();
//		alumno3.estudiar();
	}

}
