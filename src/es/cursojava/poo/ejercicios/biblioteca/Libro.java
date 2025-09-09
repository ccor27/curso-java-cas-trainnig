package es.cursojava.poo.ejercicios.biblioteca;

import java.util.Objects;

public class Libro {

	private String titulo;
	private String autor;
	private String isbn;

	public Libro(String titulo, String autor, String isbn) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void mostrarLibro() {
		System.out.println("Libro: "+
	                       "\n  - titulo: "+this.titulo+
	                       "\n  - autor: "+this.autor+
	                       "\n  - isbn: "+this.isbn+
	                       "\n");
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, isbn, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor);
	}

}
