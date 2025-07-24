package es.cursojava.metodos.ejercicios;

import java.util.regex.Pattern;

import es.cursojava.utils.Utilidades;

public class Ejercicio5 {

	private static String[] menu = { "Pintar Cuadrado", "Validar Email", "Añadir Alumno", "Salir" };
	private static String patter = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]{2,}\\.[a-zA-Z]{2,6}$";

	public static void menuExercise() {
		
		boolean menuFlag = true;
		while(menuFlag) {
			Utilidades.pintaMenu(menu);
			int option = Utilidades.pideDatoNumerico("");// send an empty string 'cause the pintaMenu already print			// "Introduce option"
			switch (option) {
			case 1: {
				printSquare();
				break;
			}
			case 2: {
				validateEmail();
				break;
			}
			case 3: {
				
				break;
			}
			case 4: {
				System.out.println("Adios!");
				menuFlag = false;
				break;
			}
			default:
				System.out.println("Opcion no valida!");
			}
		}

	}

	private static void printSquare() {
		int height = Utilidades.pideDatoNumerico("Ingresa el alto del cuadrado: ");
		int width = Utilidades.pideDatoNumerico("Ingresa el ancho del cuadrado: ");
		System.out.println();
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if ((i == 0 || i == width - 1) || (j == 0 || j == height - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void validateEmail() {
		System.out.println();
		String email = Utilidades.pideDatoCadena("Ingresa el email a validar: ");
		if (Pattern.matches(patter, email))
			System.out.println("El email es valido!");
		else {
			if (email.contains(" "))
				System.out.println("El email no es valido porque hay espacios en blanco!");
			else if (email.isEmpty())
				System.out.println("No ha ingresado nada, por favor ingrese un correo");
			else if (email.indexOf('@') == email.lastIndexOf('@')) {
				if (email.indexOf('@') < email.lastIndexOf('.')) {
					if (email.indexOf('.', email.indexOf('@')) - email.indexOf('@') >= 2) {
						if (email.length() - email.lastIndexOf('.') - 1 >= 2
								&& email.length() - email.lastIndexOf('.') - 1 <= 6)
							System.out.println("El email es valido!");
						else
							System.out.println(
									"El email no es valido porque luego del ultimo . debe hacer entre 2 y 6 caracteres");
					} else
						System.out.println(
								"El email no es valido porque entre el @ y el . a su derecha debe haber almenos 2 caracteres de separacion");
				} else
					System.out.println("El email no es valido porque no hay al menos un punto despues del @");

			} else
				System.out.println("El email no es valido porque tiene mas de un @");
		}
		System.out.println();
	}
}
