package bolentin4;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Variables para operar
		int num1, num2 = 0;
		// Un contador para ver cunantos numero han sido introducidos
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Dame numeros");
			num1 = sc.nextInt();
			num2 += num1;
			contador++;
		} while (num1 >= 0);
		System.out.println(num2+" has introduciodo "+contador);
	}

}
