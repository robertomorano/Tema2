package boletin3;

import java.util.Scanner;
public class Ej5 {

	public static void main(String[] args) {
		int respuesta;
		int n1, n2;
		n1 = (int)(Math.random()*100);
		n2 = (int)(Math.random()*100);
		System.out.println(n1+"+"+n2);
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuanto es la suma");
		respuesta = sc.nextInt();
		if (respuesta ==(n1+n2)) {
			System.out.println("correcto");
		}
	}

}
