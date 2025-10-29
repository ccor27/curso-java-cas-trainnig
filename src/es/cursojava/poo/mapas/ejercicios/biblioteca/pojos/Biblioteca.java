package es.cursojava.poo.mapas.ejercicios.biblioteca.pojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.cursojava.poo.mapas.ejercicios.biblioteca.utils.Utilidades;

public class Biblioteca {

	private String nombre;
	private Map<Autor, List<Libro>> libros;

	public Biblioteca(String nombre) {
		super();
		this.nombre = nombre;
		this.libros = new HashMap<>();
		iniciarDatos();
	}

	private void iniciarDatos() {

		Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
		Autor autor2 = new Autor("Isabel Allende", "Chilena");
		Autor autor3 = new Autor("J.K. Rowling", "Británica");
		Autor autor4 = new Autor("Haruki Murakami", "Japonés");

		libros.put(autor1,
				Arrays.asList(new Libro("Cien años de soledad", "978-84-376-0494-7", 1967),
						new Libro("El amor en los tiempos del cólera", "978-84-376-0495-4", 1985),
						new Libro("Crónica de una muerte anunciada", "978-84-376-0496-1", 1981)));

		libros.put(autor2,
				Arrays.asList(new Libro("La casa de los espíritus", "978-84-204-8394-2", 1982),
						new Libro("El cuaderno de Maya", "978-84-204-8396-6", 2011),
						new Libro("Kafka en la orilla", "978-84-397-1766-8", 2002)));

		libros.put(autor3, Arrays.asList(new Libro("Harry Potter y la piedra filosofal", "978-84-9838-266-6", 1997),
				new Libro("Los cuentos de Beedle el Bardo", "978-84-9838-500-1", 2016)));

		libros.put(autor4, Arrays.asList(new Libro("Tokio Blues", "978-84-397-1765-1", 1987)));
	}

	/**
	 * Metodo para mostrar las nacionalidades de los autores
	 */
	public void mostrarNacionalidades() {
		if (!libros.isEmpty()) {
			Set<Autor> autores = libros.keySet();
			System.out.println("\n======================== Nacionalidad de los autores ========================");
			for (Autor autor : autores) {
				if (autor != null) {
					System.out
							.println("\t" + autor.getNombre() + " tiene la nacionalidad -> " + autor.getNacionalidad());
				}
			}
			System.out.println("=============================================================================");
		} else {
			System.out.println("No hay libros disponibles!");
		}

	}

	/**
	 * Metodo para mostrar el titulo de los libros publicados despues del 2010
	 */
	public void mostrarLibrosPublicadosDespuesDelDosMilDiez() {
		if (!libros.isEmpty()) {
			Collection<List<Libro>> listaDeLibros = libros.values();
			System.out.println("\n======================== Libros publicados depues del 2010 ========================");
			for (List<Libro> lista : listaDeLibros) {
				for (Libro libro : lista) {
					if (libro != null && libro.getAnio() > 2010) {
						System.out.println("\t" + libro.getTitulo());
					}
				}
			}
			System.out.println("===================================================================================");
		} else {
			System.out.println("No hay libros disponibles!");
		}
	}

	/**
	 * Metodo para mostrar el autor que tenga mas de 2 libros y el nombre de todos
	 * sus libros
	 */
	public void mostrarAutorQueTengaMasDeDosLibrosYElNombreDeLosLibros() {
		if (!libros.isEmpty()) {
			Set<Entry<Autor, List<Libro>>> autorYLibros = libros.entrySet();
			System.out.println("======================== Autores con mas de dos libros ========================");
			for (Entry<Autor, List<Libro>> entry : autorYLibros) {
				List<Libro> librosAutor = entry.getValue();
				Autor autor = entry.getKey();
				if (librosAutor.size() > 2) {
					System.out.println("Autor: " + autor.getNombre());
					librosAutor.stream().forEach(l -> System.out.println("\t" + l.getTitulo()));
				}
			}
			System.out.println("================================================================================");
		} else {
			System.out.println("No hay libros disponibles!");
		}
	}

	/**
	 * Metodo para agregar un libro a un autor, si el autor no existe, crearlo
	 */
	public void agregarLibro() {
		System.out.println("\n======================== Agregar un libro ========================");
		String nombreAutor = "";
		String nombreLibro = "";
		String isbn = "";
		int anio = -1;
		do {
			nombreAutor = Utilidades.pideDatoCadena("Ingresa el nombre del autor");
			if (nombreAutor.isEmpty() || nombreAutor.isBlank()) {
				System.out.println("No se aceptan datos vacios!");
			}
		} while (nombreAutor.isEmpty());

		Autor autor = existeAutor(nombreAutor);
		if (autor == null) {
			String nacionalidad = Utilidades
					.pideDatoCadena("El autor no existe en la base de datos\n por favor ingrese su nacionalidad:");
			autor = new Autor(nombreAutor, nacionalidad);
			libros.put(autor, new ArrayList<Libro>());
		}
		do {
			nombreLibro = Utilidades.pideDatoCadena("Ingresa titulo del libro:");
			if (nombreLibro.isEmpty() || nombreLibro.isBlank()) {
				System.out.println("No se aceptan datos vacios!");
			}
		} while (nombreLibro.isEmpty());

		do {
			isbn = Utilidades.pideDatoCadena("Ingresa isbn del libro:");
			if (isbn.isEmpty() || isbn.isBlank()) {
				System.out.println("No se aceptan datos vacios!");
			}
		} while (isbn.isEmpty());

		do {
			anio = Utilidades.pideDatoNumerico("Ingresa año de publicacion del libro:");
			if (anio < 0) {
				System.out.println("No se aceptan valores negativos!");
			}
		} while (anio < 0);

		Libro nuevoLibro = new Libro(nombreLibro, isbn, anio);
		libros.get(autor).add(nuevoLibro);
		System.out.println("libro agregado con exito!");
		System.out.println("\n==================================================================");
	}

	/**
	 * Metodo para obtener un autor por su nombre
	 * 
	 * @param nombre
	 * @return Autor
	 */
	private Autor existeAutor(String nombre) {
		if (!libros.isEmpty()) {
			Set<Autor> autores = libros.keySet();
			for (Autor a : autores) {
				if (a != null && a.getNombre().equals(nombre)) {
					return a;
				}
			}
		}
		return null;

	}

	/**
	 * Metodo para eliminar un libro por su isbn
	 * 
	 * @param isbn
	 */
	public void eliminarUnLibroPorSuIsbn() {

		String isbn = "";
		boolean existeLibro = false;
		System.out.println("\n======================== Eliminar un libro ========================");
		do {
			isbn = Utilidades.pideDatoCadena("Ingresa isbn del libro:");
			if (isbn.isEmpty() || isbn.isBlank()) {
				System.out.println("No se aceptan datos vacios!");
			}
		} while (isbn.isEmpty());
		for (Map.Entry<Autor, List<Libro>> entry : libros.entrySet()) {
			String nombreAutor = entry.getKey().getNombre();
			List<Libro> listaLibros = entry.getValue();
			for (Libro libro : listaLibros) {
				if (libro != null && libro.getIsbn().equals(isbn)) {
					System.out.println("\tEl libro " + libro.getTitulo() + " con el isb " + isbn + " y autor "
							+ nombreAutor + "\n\tSe ha eliminado con exito");
					existeLibro = true;
					break;
				}
			}
		}
		if (!existeLibro) {
			System.out.println("No existe un libro con ese isbn");
		}
		System.out.println("\n===================================================================");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<Autor, List<Libro>> getLibros() {
		return libros;
	}

	public void setLibros(Map<Autor, List<Libro>> libros) {
		this.libros = libros;
	}

}
