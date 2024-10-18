package bolentin4;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int num1, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame numeros");
		num1 = sc.nextInt();
		//bucle para pedir al usuario numeros hasta que se introduzca uno negativo
		while (num1 >= 0) {
			num2 += num1;
			System.out.println("Dame numeros");
			num1 = sc.nextInt();
		}
		System.out.println(num2);
		sc.close();
	}

}
