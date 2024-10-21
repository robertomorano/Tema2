package boletin5;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		int numDado1;
		int numDado2;
		Scanner sc = new Scanner(System.in);
		do {
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
		}while(!(numDado1 >1 && numDado1<7));
		sc.close();
	}

}
