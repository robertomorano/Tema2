package boletin2;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		// Random rand = new Random();
		int numDado1;
		String numDado2;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Cuanto has sacado");
		// Leer el numero introducido por pantalla
		numDado1 = sc.nextInt();
		switch (numDado1) {
		case 1:
			System.out.println("UNO");
			break;
		case 2:
			System.out.println("DOS");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("CUATRO");
			break;
		case 5:
			System.out.println("CINCO");
			break;
		case 6:
			System.out.println("SEIS");
			break;
		default:
			System.out.println("Introduce una real");
		}
		// Preguntamos
		System.out.println("Cuanto has sacado en la segunda tirada");
		// Leer el numero introducido por pantalla
		numDado2 = sc.next();
		int num = switch (numDado2) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "Tres" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			yield -1;
		}
		};
		System.out.println("La suma de los dos es: " + (numDado1 + num));
		sc.close();

	}

}
