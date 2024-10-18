package ingles;

import java.util.Scanner;

	public class Ej2 {
		public static void main(String[] args) {
			// variables to get from the user
			int number1;
			int number2=0;
			int number;
			Scanner sc = new Scanner(System.in);
			System.out.println("Write a number");
			number1 = sc.nextInt();
			while (number2<10) {
				number = number1 * number2;
				number2++;
				System.out.println(number1+" * "+number2+" = "+number);
			}
			System.out.println("End of the program");
			sc.close();
		}

}
