package boletini1;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Numero por favor");
		// Leer el numero introducido por pantalla
		n1 = sc.nextInt();
		System.out.println("Numero por favor");
		// Leer el numero introducido por pantalla
		n2 = sc.nextInt();
		System.out.println("Numero por favor");
		// Leer el numero introducido por pantalla
		n3 = sc.nextInt();
		if ((n1 + n2 == n3) || (n1 + n3 == n2) || (n2 + n3 == n1)) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
		sc.close();
	}
}