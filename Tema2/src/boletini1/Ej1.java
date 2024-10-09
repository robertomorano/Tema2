package boletini1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("eCantidad para ver si es par");
		// Leer el numero introducido por pantalla
		n = sc.nextInt();
		if (n%2 == 0) {
			System.out.println("Es par");
		}else {
			System.out.println("impar");
		}
	}

}
