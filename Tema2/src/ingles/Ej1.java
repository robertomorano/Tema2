package ingles;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// variables to get from the user
		int number1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame numeros");
		number1 = sc.nextInt();
		while (number1>=0) {
			//conditional used to check if a number is even or odd
			if (number1%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			System.out.println("Write a number");
			number1 = sc.nextInt();
		}
		System.out.println("End of the program");
		sc.close();
	}

}
