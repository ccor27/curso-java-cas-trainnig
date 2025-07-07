package es.cursojava.inicio.condicionales;

public class CondicionalesSwitch {

	public static void main(String[] args) {

		String mes = "enero";
		switch (mes) {
		case "enero":
		case "febrero":
		case "marzo":
			System.out.println("Invierno");
			break;
		case "abril":
		case "mayo":
		case "junio":
			System.out.println("Primavera");
			break;
		case "julio":
		case "agosto":
		case "septiembre":
			System.out.println("Verano");
			break;
		case "octubre":
		case "noviembre":
		case "diciembre":
			System.out.println("Otoño");
			break;
		default:
		System.out.println("Mes incorrecto!");
		}
	}
}
