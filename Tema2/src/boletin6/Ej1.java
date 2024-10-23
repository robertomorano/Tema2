package boletin6;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		num1 = sc.nextInt();
		for(int i = 0; i<num1;i++) {
			System.out.println(i+1);
		}

	}
	
}
