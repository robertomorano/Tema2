package boletini1;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		//
		int n1;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("eCantidad para ver si es par");
		// Leer el numero introducido por pantalla
		n1 = sc.nextInt();
		if ((n1 < 5) && (n1 >= 0)) {
			System.out.println("Insuficiente");
		} else if ((n1>=5) && (n1 < 7)) {
			System.out.println("Suficiente");
		} else if ((n1>=7) && (n1 < 9)) {
			System.out.println("Notable");
		} else if ((n1>=9) && (n1<=10)) {
			System.out.println("Sobresaliente");
			}
		sc.close();
	}
		
}
