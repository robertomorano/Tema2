package Boletinifrlse;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("eCantidad para ver si es par");
		// Leer el numero introducido por pantalla
		n1 = sc.nextInt();
		// Preguntamos
		System.out.println("eCantidad para ver si es par");
		// Leer el numero introducido por pantalla
		n2 = sc.nextInt();
		if (n1 < n2) {
			System.out.println(n1+"<"+n2);
		}else {
			System.out.println(n2+"<"+n1);
		}
	}
}

