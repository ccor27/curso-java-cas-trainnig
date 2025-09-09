package es.cursojava.poo.ejercicios.biblioteca;

public class Biblioteca {

	private String nombre;
	private Direccion direccion;
	private Libro[] libros;
	private int contadorLibros;

	public Biblioteca(String nombre, Direccion direccion, int cantidadLibros) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.libros = new Libro[cantidadLibros
		                        ];
		this.contadorLibros = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Libro[] getLibros() {
		return libros;
	}
	
	public void agregarLibro(Libro libro) {
		if(contadorLibros < libros.length) {
			libros[contadorLibros] = libro;
			contadorLibros++;
		}else {
			System.out.println("Libreria llena!");
		}
	}
	public void mostrarLibros() {
		System.out.println("===============Libros de la biblioteca====================");
		for (Libro libro : libros) {
			if(libro!=null) {
				libro.mostrarLibro();
			}
		}
		System.out.println("==========================================================\n");
	}
	public void mostrarInfoBiblioteca() {
		System.out.println("==============================Biblioteca===========================");
		direccion.mostrarDireccion();
		this.mostrarLibros();
		System.out.println("===================================================================\n");
		
	}

}
