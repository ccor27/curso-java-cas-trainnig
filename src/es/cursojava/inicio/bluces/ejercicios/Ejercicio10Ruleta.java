package es.cursojava.inicio.bluces.ejercicios;

import java.util.Scanner;

public class Ejercicio10Ruleta {

	// numero importe
	// numero a apostar
	// generar el numero ganador aleatoriamente (0-36)
	// si ganamos multiplicamos lo apostado * 10
	// sino, restar del saldo/importe que tenemos
	// al finalizar se pregunta si quiere seguir jugando, siempre que haya dinero
	// si no hay mas dinero, cerrar el programa

	// dar diferentes opciones de juego, por numero, par e impar o por docenas
	
	//TODO: al momento de jugar por bloques y querer jugar otra vez, preguntar por cuanto quiere apostar

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fondos = 0;
		double cantidadApostar = 0;
		// variables to play
		int numeroApostar;
		int numeroAleatorio;
		int opcionMenuPrincipal;
		int opcionMenuRuleta;
		int opcionMenuRuletaBloque;
		Scanner scanner;
		// flags
		boolean flagMenuPrincipal = true;
		boolean flagMenuRuleta;
		boolean esJugadorDeRuleta = false;
		boolean esJugadorDeRuletaBloque = false;
		boolean flagMenuRuletaBloques = true;
		while (flagMenuPrincipal) {
			System.out.println("\n==========================Casino==========================");
			System.out.println("1. Añadir fondos");
			System.out.println("2. Consultar fondos");
			System.out.println("3. Jugar a la ruleta");
			System.out.println("4. Salir");
			System.out.println("\n==========================================================");
			scanner = new Scanner(System.in);
			opcionMenuPrincipal = scanner.nextInt();
			switch (opcionMenuPrincipal) {
			case 1: {
				System.out.println("Ingrese la cantidad de dinero a ingresar:");
				scanner = new Scanner(System.in);
				fondos = scanner.nextDouble();
				if (fondos < 0) {
					System.out.println("No puede ingresar valores negativos a sus fondos!");
					fondos = 0;
				} else
					System.out.println("Importe de " + fondos + " con exito!");
				break;
			}
			case 2: {
				System.out.println("Actualmente tiene un saldo de " + fondos);
				break;
			}
			case 3: {
				if (fondos > 0) {

					flagMenuRuleta = true;
					while (flagMenuRuleta) {
						if(fondos == 0) {
							System.out.println("No tiene fondos, por favor añada");
							flagMenuRuleta = false;
							esJugadorDeRuleta = false;
							break;
						}
						if (esJugadorDeRuleta) {
							System.out.println("\nDesea seguir jugando la ruleta?");
							scanner = new Scanner(System.in);
							String respuesta = scanner.nextLine();
							if (respuesta.equalsIgnoreCase("no")) {
								esJugadorDeRuleta = false;
								break;
							}
						}

						System.out.println("\nBienvenido a la ruleta, cuanto desea apostar?");
						esJugadorDeRuleta = true;
						scanner = new Scanner(System.in);
						cantidadApostar = scanner.nextDouble();

						if (cantidadApostar > fondos) {
							System.out.println("Lo sentimos, no tienes los fondos suficientes. Adios!");
							esJugadorDeRuleta = false;
							break;
						} else if (cantidadApostar < 0) {
							System.out.println("No puede apostar valores negativos!");
							flagMenuRuleta = false;
							cantidadApostar = 0;
						} else {

							System.out.println("\nQue juego desea?");
							System.out.println("1. Apostar por un numero");
							System.out.println("2. Apostar por pares");
							System.out.println("3. Apostar por impares");
							System.out.println("4. Apostar por bloques");
							System.out.println("5. Salir");
							scanner = new Scanner(System.in);
							opcionMenuRuleta = scanner.nextInt();
							switch (opcionMenuRuleta) {
							case 1: {
								System.out.println("Ingrese el numero a apostar (1-36)");
								scanner = new Scanner(System.in);
								numeroApostar = scanner.nextInt();
								if (numeroApostar < 1 || numeroApostar > 36)
									System.out.println("Numero incorrecto!");
								else {
									System.out.println(".......ruleta en curso.......");
									numeroAleatorio = (int) (Math.random() * 36) + 1;
									System.out.println("Numero ganador " + numeroAleatorio);
									if (numeroAleatorio == numeroApostar) {
										System.out.println("Felicidades, has ganado!");
										fondos += cantidadApostar * 36;
										System.out.println("Has ganado: " + cantidadApostar * 36
												+ " , ahora tienes un saldo de " + fondos);
									} else {
										System.out.println("Vaya, has perdido :(");
										fondos -= cantidadApostar;
										System.out.println("Has perdido: " + cantidadApostar
												+ " , ahora tienes un saldo de " + fondos);
									}
								}
								numeroAleatorio = 0;
								break;
							}
							case 2: {
								System.out.println(".......ruleta en curso.......");
								numeroAleatorio = (int) (Math.random() * 36) + 1;
								System.out.println("Numero ganador " + numeroAleatorio);
								if (numeroAleatorio % 2 == 0) {
									System.out.println("Felicidades, has ganado!");
									fondos += cantidadApostar * 2;
									System.out.println("Has ganado: " + cantidadApostar * 2
											+ " , ahora tienes un saldo de " + fondos);
								} else {
									System.out.println("Vaya, has perdido :(");
									fondos -= cantidadApostar;
									System.out.println("Has perdido: " + cantidadApostar
											+ " , ahora tienes un saldo de " + fondos);
								}
								numeroAleatorio = 0;
								break;
							}
							case 3: {
								System.out.println(".......ruleta en curso.......");
								numeroAleatorio = (int) (Math.random() * 36) + 1;
								System.out.println("Numero ganador " + numeroAleatorio);
								if (numeroAleatorio % 2 != 0) {
									System.out.println("Felicidades, has ganado!");
									fondos += cantidadApostar * 2;
									System.out.println("Has ganado: " + cantidadApostar * 2
											+ " , ahora tienes un saldo de " + fondos);
								} else {
									System.out.println("Vaya, has perdido :(");
									fondos -= cantidadApostar;
									System.out.println("Has perdido: " + cantidadApostar
											+ " , ahora tienes un saldo de " + fondos);
								}
								numeroAleatorio = 0;
								break;
							}
							case 4: {
								while (flagMenuRuletaBloques) {
									if (esJugadorDeRuletaBloque) {
										System.out.println("\nDesea seguir jugando apostando por bloques?");
										scanner = new Scanner(System.in);
										String respuesta = scanner.nextLine();
										if (respuesta.equalsIgnoreCase("no")) {
											esJugadorDeRuletaBloque = false;
											break;
										}
									}
									esJugadorDeRuletaBloque = true;
									System.out.println("\nQue bloque desea apostar?");
									System.out.println("1. numeros del 1 al 12");
									System.out.println("2. numeros del 13 al 24");
									System.out.println("3. numeros del 25 al 36");
									System.out.println("4. cancelar");
									scanner = new Scanner(System.in);
									opcionMenuRuletaBloque = scanner.nextInt();
									switch (opcionMenuRuletaBloque) {
									case 1: {
										System.out.println(".......ruleta en curso.......");
										numeroAleatorio = (int) (Math.random() * 36) + 1;
										System.out.println("Numero ganador " + numeroAleatorio);
										if (numeroAleatorio >= 1 && numeroAleatorio <= 12) {
											System.out.println("Felicidades, has ganado!");
											fondos += cantidadApostar * 5;
											System.out.println("Has ganado: " + cantidadApostar * 5
													+ " , ahora tienes un saldo de " + fondos);
										} else {
											System.out.println("Vaya, has perdido :(");
											fondos -= cantidadApostar;
											System.out.println("Has perdido: " + cantidadApostar
													+ " , ahora tienes un saldo de " + fondos);
										}
										numeroAleatorio = 0;
										break;
									}
									case 2: {
										System.out.println(".......ruleta en curso.......");
										numeroAleatorio = (int) (Math.random() * 36) + 1;
										System.out.println("Numero ganador " + numeroAleatorio);
										if (numeroAleatorio >= 13 && numeroAleatorio <= 24) {
											System.out.println("Felicidades, has ganado!");
											fondos += cantidadApostar * 5;
											System.out.println("Has ganado: " + cantidadApostar * 5
													+ " , ahora tienes un saldo de " + fondos);
										} else {
											System.out.println("Vaya, has perdido :(");
											fondos -= cantidadApostar;
											System.out.println("Has perdido: " + cantidadApostar
													+ " , ahora tienes un saldo de " + fondos);
										}
										numeroAleatorio = 0;
										break;
									}
									case 3: {
										System.out.println(".......ruleta en curso.......");
										numeroAleatorio = (int) (Math.random() * 36) + 1;
										System.out.println("Numero ganador " + numeroAleatorio);
										if (numeroAleatorio >= 25 && numeroAleatorio <= 36) {
											System.out.println("Felicidades, has ganado!");
											fondos += cantidadApostar * 5;
											System.out.println("Has ganado: " + cantidadApostar * 5
													+ " , ahora tienes un saldo de " + fondos);
										} else {
											System.out.println("Vaya, has perdido :(");
											fondos -= cantidadApostar;
											System.out.println("Has perdido: " + cantidadApostar
													+ " , ahora tienes un saldo de " + fondos);
										}
										numeroAleatorio = 0;
										break;
									}
									case 4: {
										esJugadorDeRuletaBloque = false;
										flagMenuRuletaBloques = false;
										break;
									}
									default:
										System.out.println("La opcion no valida!");
									}
								}
								break;
							}
							case 5: {
								esJugadorDeRuleta = false;
								flagMenuRuleta = false;
								break;
							}
							default:
								System.out.println("La opcion no valida!");
							}
						}
					}
					break;

				} else {
					System.out.println("No tiene fondos, por favor añada");
					break;
				}
			}
			case 4: {
				System.out.println("Gracias por estar en el casio, esperamos vuelva pronto, adios!");
				flagMenuPrincipal = false;
				break;
			}
			default:
				System.out.println("La opcion no valida!");
			}
		}
	}
}
