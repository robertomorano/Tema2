package boletin2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int nota;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Introduce una nota");
		// Leer el numero introducido por pantalla
		nota = sc.nextInt();
		switch (nota) {
		case 0, 1, 2, 3, 4:
			System.out.println("Suspendido");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7, 8:
			System.out.println("Notable");
			break;
		case 9, 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Introduce una nota real");

		}
		;

	}

}
