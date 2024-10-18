package ingles;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		int userTry;
		//variable for the random number
		int n1;
		//random number generator
		n1 = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		System.out.println("Try to guess the number");
		userTry = sc.nextInt();
		while(userTry!=n1) {
		if (userTry<n1) {
			System.out.println("Number is greater");
		}else {
			System.out.println("Number is lower");	
			}
		System.out.println("Try to guess the number");
		userTry = sc.nextInt();
	}
		System.out.println("Number is correct");
		sc.close();
	}
		
	}
