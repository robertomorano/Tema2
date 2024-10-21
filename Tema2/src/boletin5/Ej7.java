package boletin5;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		String eleccion;
		int n1, n2;
		Scanner sc = new Scanner(System.in);

		// Preguntamos
		do {
			System.out.println("Introduce un  mumero");
			// Leer el numero introducido por pantalla
			n1 = sc.nextInt();
			System.out.println("Introduce otro numer");
			// Leer el numero introducido por pantalla
			n2 = sc.nextInt();
			System.out.println(
					"Introduce una opcion ¿Que quieres hacer?\n" + "A: SUMAR LOS NÚMEROS\n" + "B: RESTAR LOS NÚMEROS\n"
							+ "C: MULTIPLICAR LOS NÚMEROS\n" + "D: DIVIDIR LOS NÚMEROS\r\n " + "E: PARA SALIR");
			// Leer el numero introducido por pantalla
			eleccion = sc.next();
			switch (eleccion) {
			case "A":
				System.out.println(n1 + n2);
				break;
			case "B":
				System.out.println(n1 - n2);
				break;
			case "C":
				System.out.println(n1 * n2);
				break;
			case "D":
				System.out.println(n1 / n2);
				break;
			default:
				System.out.println("Introduce una opcion real");
			}
		} while (!(eleccion.equals("E")));
	}

}
