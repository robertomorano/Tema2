package boletin6;

import java.util.Scanner;

public class EJ7 {

	public static void main(String[] args) {
		// variable que se le pedira al usuario
		int num = 0;
		// variable tipo booleano que indica si es primo
		boolean primo = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero para ver si es primo");
		num = sc.nextInt();
		while (num <= 1) {
			System.out.println("Un numero positivo que no sea 0 ni 1");
			num = sc.nextInt();
		}
		for (int i = 2; i < num / 2; i++) {
			if ((num % i == 0) && (primo)) {
				primo = false;
			}
		}
		if (primo) {
			System.out.print("Tu numero es primo");
		} else {
			System.out.println("No es primo");
		}
		sc.close();
	}

}
