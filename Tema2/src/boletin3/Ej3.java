package boletin3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Variable que se le pieden al usuario
		int dni;
		//variable para operar
		int calculo;
		String letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame tu DNI");
		dni = sc.nextInt();
		calculo = dni%23;
		System.out.print(dni);
		switch (calculo) {
		case 0:
			System.out.println("T");
		}
	}

}
