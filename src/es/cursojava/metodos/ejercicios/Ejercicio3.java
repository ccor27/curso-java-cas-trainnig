package es.cursojava.metodos.ejercicios;

public class Ejercicio3 {
	
	public static String rectangleProperties(double base, double height) {
		double area;
		double perimeter;
		double diagonal;
		area = base * height;
		perimeter =  2 * (base + height);
		diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(height,2));
		String message = "Las operaciones del rectangulo son:\n\n"+
		                "   - El area del rectangulo es: "+area+"\n"+
						"   - El perimetro del rectangulo es: "+perimeter+"\n"+
						"   - La diagonal del rectangulo es: "+diagonal+"\n";
		return message;
	}

}
