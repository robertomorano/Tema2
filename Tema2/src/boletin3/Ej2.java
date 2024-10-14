package boletin3;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		//numero de pruebas 2
		int num1;
		//variable con la que operamos
		int n;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Dame un numero");
		// Leer el numero introducido por pantalla
		num1 = sc.nextInt();
		n = (num1<0)?-num1:num1;
		System.out.println(n);
	}
}
	

