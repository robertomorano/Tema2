package ingles;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// variables to get from the user
		double userHeight;
		// variables to check
		double highest = 0;
		double lowest = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Write your high");
		userHeight = sc.nextInt();
		lowest = userHeight;
		//
		while (userHeight != 0) {
			if (userHeight > highest) {
				highest = userHeight;
			} 
			if (userHeight < lowest) {
				lowest = userHeight;
			}
			System.out.println("Write your high");
			userHeight = sc.nextInt();
		}
		System.out.println(lowest+" is the lowest "+highest+" is the highest");
		System.out.println("End of the program");
		sc.close();

	}

}
