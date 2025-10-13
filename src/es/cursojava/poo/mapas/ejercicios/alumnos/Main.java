package es.cursojava.poo.mapas.ejercicios.alumnos;

public class Main {

	public static void main(String[] args) {
		Colegio colegio = new Colegio();
		colegio.mostrarCantidadAulas();
		System.out.println();
		colegio.mostrarDatosDeAlumosPorAula();
		System.out.println();
		colegio.mostrarCantidadAlumnosPorAula();
		System.out.println();
		colegio.mostrarAlumnosDeUnAula("aula1");
		System.out.println();
		colegio.mostrarAlumnosDeUnAula("aula10");
		System.out.println();
		colegio.mostrarAulaConElAlumnoConMasNotaMedia();
	}
}
