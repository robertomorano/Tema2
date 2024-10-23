package boletin6;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		//variable para pedir factorial
		int factorial = 1;
		//variable que suma los valores del factorial
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		num = sc.nextInt();
		for(int i = num; i>=2;i--) {
			System.out.print(i+"*");
			factorial *= i;
		}
		System.out.print("1 = "+ factorial);

	}

}
