package es.cursojava.inicio.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email;
		String patter = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]{2,}+\\.[a-zA-Z]{2,6}$";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el email a validar: ");
		email = scanner.nextLine();
		if(Pattern.matches(patter, email))
				System.out.println("El email es valido!");
		else {
			if(email.contains(" ") )
				System.out.println("El email no es valido porque hay espacios en blanco!");
			else if(email.isEmpty())
				System.out.println("No ha ingresado nada, por favor ingrese un correo");
			else if(email.indexOf('@') == email.lastIndexOf('@')) {
				if(email.indexOf('@') < email.lastIndexOf('.')) {
					if(email.indexOf('.', email.indexOf('@')) - email.indexOf('@') >= 2){
						if(email.length() - email.lastIndexOf('.') - 1 >= 2 && email.length() - email.lastIndexOf('.') - 1 <= 6)
							System.out.println("El email es valido!");
						else
							System.out.println("El email no es valido porque luego del ultimo . debe hacer entre 2 y 6 caracteres");
					}else
						System.out.println("El email no es valido porque entre el @ y el . a su derecha debe haber almenos 2 caracteres de separacion");
				}else
					System.out.println("El email no es valido porque no hay al menos un punto despues del @");
				
			}else
				System.out.println("El email no es valido porque tiene mas de un @");
		}
		scanner.close();
	}

}
