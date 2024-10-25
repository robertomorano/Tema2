package boletinbucles;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Variable a pedir
		int num1;
		int num2 = 1;
		// boolenao de comprobacion del primo
		boolean primo = true;
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario
		System.out.println("Dame un numero");
		num1 = sc.nextInt();
		for (int j = 0; j < num1; j++) {
			for (num2 = 1; num2 <= j; num2++) {
				if ((j % num2 == 0) && (primo)) {
					primo = false;
				}
			}
			if (primo) {
				System.out.println(j + " es primo");
			} 
		}
	}

}
