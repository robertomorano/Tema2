package boletin6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		//Variable para el numero de suspensos
		int susp = 0;
		//Variable para pedir un numero
		int num;
		//Constante para el numero maximo del bucle for
		final int UNTIL= 5;
		Scanner sc = new Scanner(System.in);
		//for para pedir las 5 notas
		for(int i = 0;i<UNTIL;i++) {
			System.out.println("Dame tu nota");
			num=sc.nextInt();
			if (num<5) {
				susp++;
			}
		}
		System.out.println("Hay "+susp+" suspensos");
		sc.close();
	}

}
