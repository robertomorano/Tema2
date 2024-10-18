package boletin5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		int userTry;
		//variable for the random number
		int n1;
		//random number generator
		n1 = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		do {
			 	System.out.println("Try to guess the number");
				userTry = sc.nextInt();
				if (userTry<n1) {
					System.out.println("Number is greater");
				}else if (userTry>n1){
					System.out.println("Number is lower");	
				}
		}while(userTry!=n1);
		System.out.println("Number is correct");
		sc.close();
	}

	}
