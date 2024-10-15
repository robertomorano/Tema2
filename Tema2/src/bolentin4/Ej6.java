package bolentin4;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		int num1, num2 = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Dame numeros");
			num1 = sc.nextInt();
			if (num1 >= num2){
				num2 = num1;
			}
		} while (num1 >= 0);
		System.out.println(num2);
		sc.close();
	}

}
