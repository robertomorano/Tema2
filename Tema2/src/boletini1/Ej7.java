package boletini1;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("eCantidad para ver si es par");
		// Leer el numero introducido por pantalla
		n1 = sc.nextInt();
		if (n1 < 10) {
			System.out.println("1");
		}else if(n1 < 100){
			System.out.println("2");
			}else if(n1 <1000) {
				System.out.println("3");
			}else if(n1<10000) {
				System.out.println("4");
			}
		sc.close();
	}

}
