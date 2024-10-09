package boletin2;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		String eleccion;
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		// Preguntamos
		System.out.println("Introduce un  mumero");
		// Leer el numero introducido por pantalla
		n1 = sc.nextInt();
		System.out.println("Introduce otro numer");
		// Leer el numero introducido por pantalla
		n2 = sc.nextInt();
		System.out.println("Introduce una opcion ¿Que quieres hacer?\n"
				+ "A: SUMAR LOS NÚMEROS\n"
				+ "B: RESTAR LOS NÚMEROS\n"
				+ "C: MULTIPLICAR LOS NÚMEROS\n"
				+ "D: DIVIDIR LOS NÚMEROS\r\n");
		// Leer el numero introducido por pantalla
		eleccion = sc.next();
		switch (eleccion) {
		case "A":
			System.out.println(n1+n2);
			break;
		case "B":
			System.out.println(n1-n2);
			break;
		case "C":
			System.out.println(n1*n2);
			break;
		case "D":
			System.out.println(n1/n2);
			break;
		default:
			System.out.println("Introduce una opcion real");
		}

	}

}
