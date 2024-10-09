package boletin2;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		String eleccion;
		Scanner sc = new Scanner(System.in);

		// Preguntamos
		System.out.println("Que letra tienes\n");
		// Leer el numero introducido por pantalla
		eleccion = sc.next();
		switch (eleccion) {
		case "A":
			System.out.println("Motocicletas");
			break;
		case "B1", "B2":
			System.out.println("automoviles");
			break;
		case "C1","C5":
			System.out.println("camiones");
			break;
		case "D":
			System.out.println("autobuses");
			break;
		case "E":
			System.out.println("remolques");
			break;
		default:
			System.out.println("Introduce una opcion real");
		}
	}

}