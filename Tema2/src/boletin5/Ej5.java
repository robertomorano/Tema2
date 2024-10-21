package boletin5;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		String userTry;
		//variable for the random number
		int n1;
		//Random for the new interval
		int lower = 101;
		int hi = 1;
		//random number generator
		Random rand = new Random();
		n1 = rand.nextInt(hi,lower);
		Scanner sc = new Scanner(System.in);
		do {
			 	System.out.println(n1+" Is the number grater or lower?");
				userTry = sc.next();
				if (userTry.equals("menor")) {
					lower = n1;
					n1 = rand.nextInt(hi,lower);
				}else if (userTry.equals("mayor")){
					hi = n1;
					n1 = rand.nextInt(hi,lower);
				}
		}while(!(userTry.equals("correcto")));
		System.out.println("Number is correct");
		sc.close();
	}

}
