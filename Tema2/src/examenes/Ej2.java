package examenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		boolean error = false;
		int num=0;
		int numMod=0;
		//contadores
		int contPares=0,contImpares=0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Dame un numero");
				num = sc.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				error = true;
				System.out.println(e.getMessage());
			} finally {
				sc.nextLine();
			}
		} while (error);
		numMod=num;
		//Un while para descomponer el numero
		while(numMod>0) {
			if((numMod%10)%2==0) {
				contPares++;
			}else {
				contImpares++;
			}
			numMod/=10;
		}
		System.out.println("Impares: "+contImpares+" Pares: "+contPares);
	}

}
