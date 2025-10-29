package es.cursojava.poo.mapas.ejercicios.biblioteca;

import es.cursojava.poo.mapas.ejercicios.biblioteca.pojos.Biblioteca;

public class Main {

	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca("Getafe");
		biblioteca.mostrarNacionalidades();
		biblioteca.mostrarLibrosPublicadosDespuesDelDosMilDiez();
		biblioteca.mostrarAutorQueTengaMasDeDosLibrosYElNombreDeLosLibros();
		biblioteca.agregarLibro();
		biblioteca.eliminarUnLibroPorSuIsbn();
	}
}
