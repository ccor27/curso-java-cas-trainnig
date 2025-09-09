package es.cursojava.poo.ejercicios.biblioteca;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca1 = new Biblioteca("Biblioteca getafe",
				new Direccion("las Arcas del Agua", "madrid", 28905), 10);

		Libro libro1 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", "978-1-4028-9467-3");
		biblioteca1.agregarLibro(libro1);
		Libro libro2 = new Libro("El jardin de los espejos", "Mariana Alcázar", "978-0-1234-5678-9");
		biblioteca1.agregarLibro(libro2);
		Libro libro3 = new Libro("Cronicas de un tiempo olvidado", "Andrés Valverde", "978-3-598-21501-6");
		biblioteca1.agregarLibro(libro3);
		Libro libro4 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0-06-088328-7");
		biblioteca1.agregarLibro(libro4);
		Libro libro5 = new Libro("La Ciudad y los Perros", "Mario Vargas Llosa", "978-0-06-073279-0");
		biblioteca1.agregarLibro(libro5);

//		biblioteca1.mostrarInfoBiblioteca();
//		biblioteca1.mostrarLibros();

		Biblioteca biblioteca2 = new Biblioteca("Biblioteca getafe2",
				new Direccion("las Arcas del Agua", "madrid", 28905), 10);

		Libro libro6 = new Libro("Cronicas de un tiempo olvidado", "Andrés Valverde", "978-3-598-21501-6");
		biblioteca2.agregarLibro(libro6);
		Libro libro7 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0-06-088328-7");
		biblioteca2.agregarLibro(libro7);
		Libro libro8 = new Libro("La sombra del viento", "Carlos Ruiz Zafón", "978-1-4028-9467-3");
		biblioteca2.agregarLibro(libro8);
		Libro libro9 = new Libro("Las Puertas del Invierno", "Camila Soto Luján", "978-2-4567-8901-2");
		biblioteca2.agregarLibro(libro9);
		Libro libro10 = new Libro("Pedro Páramo", "Juan Rulfo", "978-0-307-38999-8");
		biblioteca2.agregarLibro(libro10);
		Libro libro11 = new Libro("Los Detectives Salvajes", "Roberto Bolaño", "978-0-312-42726-3");
		biblioteca2.agregarLibro(libro11);

		findSameBooks(biblioteca1.getLibros(), biblioteca2.getLibros());
	}

	public static void findSameBooks(Libro[] libros1, Libro[] libros2) {
		for (Libro libro1 : libros1) {
			for (Libro libro2 : libros2) {
				if (libro1 != null && libro2 != null) {
					if (libro1.equals(libro2)) {
						System.out.println("ambas bibliotecas tienen el libro: " + libro1.getTitulo());
					}
				}
			}
		}
	}

}
