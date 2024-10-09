package boletin2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int diaSemana;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Introduce una nota");
		// Leer el numero introducido por pantalla
		diaSemana = sc.nextInt();
		switch (diaSemana) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Introduce una dia real");
			}
		sc.close();

	}
}