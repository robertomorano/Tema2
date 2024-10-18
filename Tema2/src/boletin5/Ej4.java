package boletin5;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		//Declaracion de variables una para el usuario las otras para operar 
		int number1,number2=0;
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a number");
		number1 = sc.nextInt();
		 do{
			number = number1 * number2;
			number2++;
			System.out.println(number1+" * "+number2+" = "+number);
		}while (number2<10);
	}

}
