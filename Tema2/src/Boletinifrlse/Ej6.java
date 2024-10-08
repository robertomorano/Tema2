package Boletinifrlse;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2,n3;
		//Variable para guardar
		double raiz, x;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("eCantidad para ver si es par");
		// Leer el numero introducido por pantalla
		n1 = sc.nextInt();
		// Preguntamos
		System.out.println("eCantidad para ver si es par");
		// Leer el numero introducido por pantalla
		n2 = sc.nextInt();
		// Preguntamos
		System.out.println("eCantidad para ver si es par");
		// Leer el numero introducido por pantalla
		n3 = sc.nextInt();
		raiz = ((n2*n2)-4*n1*n3);
		if (raiz>=0) {
			x = ((-n2+Math.sqrt(raiz))/(2*n3));
			System.out.println(x);
		}else {
			System.out.println("No se puede ejetar");}
		
	}
}