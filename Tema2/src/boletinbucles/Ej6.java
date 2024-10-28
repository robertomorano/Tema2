package boletinbucles;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		/*
		 *  
   *
  * *
 * * *
* * * *

		 * 
		 */
		//variable para pedir al usuario
		int base;
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario
		System.out.println("Dame la base del triangulo");
		base = sc.nextInt();
		for(int i=1;i<=base;i++) {
			//primero printeamos los espacios
			for(int k=base-i;k>0;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}
