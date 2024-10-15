package bolentin4;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2 = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Dame numeros");
			num1 = sc.nextInt();
			num2 += num1;
		} while (num1 >= 0);
		System.out.println(num2);
	}

}
