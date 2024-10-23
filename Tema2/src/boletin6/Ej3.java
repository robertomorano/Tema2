package boletin6;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {	
		//Variable para pedir al usuario
		int num1;
		//Constante para el numero maximo del bucle for
		final int UNTIL= 10;
		//Variable para guardar la suma
		int suma = 0;
		// contador para la media
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		//Iniciar bucle con condiciones
		for(int i = 0; i<=UNTIL;i++) {
			System.out.println("Dame un numero");
			num1 = sc.nextInt();
			suma += num1;
			counter++;
		}
		System.out.println(suma/counter);

	}	

}
