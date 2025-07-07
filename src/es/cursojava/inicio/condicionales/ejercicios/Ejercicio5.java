package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;


/*
 * Herramienta para calcular el precio de una llamada
Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, 
de tal forma que:

+ los primeros cinco minutos cuestan 1€, 
+ los siguientes 3 minutos, 80 céntimos, 
+ los siguientes dos minutos a 70 céntimos 
+ y a partir del décimo minuto, 50 céntimos cada minuto.

Se carga un impuesto del 3% cuando es domingo, 
y si es otro día, 
	en turno de mañana 15% (6-12)
	y en turno de tarde 10%. (12-23)
	y en turno de noche -10%. (23-6)

Solicitar tiempo de llamada, dia de la semana y hora y calcular el coste de la llamada


Acciones:
Crear una condición que indique que mientras la cantidad de minutos sea mayor a 0 y menor a 5 el coste sea 1 euro. 
Crear una condición que indique que si la llamada dura más de 5 minutos y menos de 8, el costo de los minutos 6, 7 y 8 sea de 80 céntimos.
Crear una condición que indique que si la llamada dura más de 8 minutos y menos y hasta 10, el costo de los minutos 9 y 10 sea de 70 céntimos.
Crear una condición que indique que si la llamada dura más de 10 minutos cada minuto valga 50 céntimos.
Crear una condición que indique que si la llamada se hace el día domingo la llamada tenga un impuesto derl 3%
Crear una condición que indique que si la llamada se hace en un día diferente al domingo se aplique:
15% turno de 06:00am a 12:00m; 10% turno de 12:00m a 23:00pm; -10% turno de 23:00am a 05:59am; 
 */
public class Ejercicio5 {
	
	public static void main(String[] args) {

		int tiempoLlamada;
		String dia;
		int hora;
		boolean flag = true;
		double costeLlamada = 0;
		double impuesto;
		Scanner scanner;
		System.out.println("=====Calcular el precio de una llamada=====");
		System.out.println("Ingrese el tiempo en minutos de la llamada:");
		scanner = new Scanner(System.in);
		tiempoLlamada = scanner.nextInt();
		System.out.println("Ingrese el dia de la llamada:");
		scanner = new Scanner(System.in);
		dia = scanner.nextLine();
		System.out.println("Ingrese la hora de la llamada:");
		scanner = new Scanner(System.in);
		hora = scanner.nextInt();
		System.out.println("Calculando...");
		
		if(tiempoLlamada > 0 && tiempoLlamada < 5)
			costeLlamada += tiempoLlamada* 1;
		else if(tiempoLlamada > 5 && tiempoLlamada < 8)
			costeLlamada += tiempoLlamada* 0.80;
		else if(tiempoLlamada > 8 && tiempoLlamada <= 10)
			costeLlamada += tiempoLlamada* 0.80;
		else
			costeLlamada += tiempoLlamada* 0.50;
		
		if(dia.equalsIgnoreCase("domingo"))
			impuesto = 0.03;
		else
		{
			if(hora >= 6 && hora <= 12)
				impuesto = 0.15;
			else if(hora > 12 && hora <= 23)
					impuesto = 0.10;
			else
				impuesto = -0.10;
				
		}
		
		costeLlamada = costeLlamada * (1 + impuesto);
		System.out.println("Este es el valor de la llamda: "+costeLlamada);
		System.out.println("===========================================");
	}

}
