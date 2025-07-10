package es.cursojava.inicio.strings;

public class FuncionesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Cristian";
		String nombre2 = "Camilo";
		String nombre3 = new String("Cristian camilo");
		
		System.out.println(nombre3.toUpperCase());
		System.out.println("Tenerife".contains("te"));
		
		String cadena = "Esto es una prueba de Strings";
		System.out.println("la posicion de la e intermedia es: "+cadena.substring(cadena.indexOf("e")+1,cadena.lastIndexOf("e")).lastIndexOf("e"));
	}

}
