package bolentin4;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables para operar
		int num1, num2 = 0;
		// Un contador para ver cunantos numero han sido introducidos
		int contador = -1;
		int mayor = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Dame numeros");
			num1 = sc.nextInt();
			num2 += num1;
			contador++;
			if (num1 >=18){
				mayor++;
			}
		} while (num1 >= 0);
		num2 -= num1; 
		System.out.println("la media; "+(num2/contador)+" has introduciodo "+contador+"niños "
				+ "la suma de sus edades es: "+ num2);
		sc.close();
	}

}
