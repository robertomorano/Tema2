package boletinbucles;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		//variable para pedir al usuario
		int num1=21;
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario
		while (num1>=20) {
		System.out.println("Dame un numero");
		num1 = sc.nextInt();}
		//for anidado numero maximo el introcido
		for(int i=0;i<=num1;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}

}
