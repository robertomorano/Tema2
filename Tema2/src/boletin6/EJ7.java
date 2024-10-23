package boletin6;

import java.util.Scanner;

public class EJ7 {

	public static void main(String[] args) {
			//variable que se le pedira al usuario
			int num;
			//variable tipo booleano que indica si es primo
			boolean primo = true;
			Scanner sc = new Scanner(System.in);
			System.out.println("Dame un numero para ver si es primo");
			num = sc.nextInt();
			for(int i = 2; i < num/2;i++) {
				if((num%i==0)&&(primo)){
					primo = false;
				}
			}
			if(primo) {
				System.out.print("Tu numero es primo");
				}else {
					System.out.println("No es primo");
				}
			


	}

}
