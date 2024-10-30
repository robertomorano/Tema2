package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		boolean error = false;
		boolean capicua = false;
		int num = 1;
		int numMod = 0;
		int cont = 0;
		int nuevocont = 0;
		// variable para hacer la potencia
		int pow = 1;
		int i = 1;
		// Variable para guardar el resto de una divison una unidad
		int resto = 0;
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
		} while (error || num < 0);
		numMod = num;
		while (numMod > 1) {
			numMod /= 10;
			cont++;
		}
		numMod = num;
		// for(i = 0; i <= cont; i++) {
		// if(numMod%((cont-i)*10)==numMod%i*10) {

		// }

		// }
		for (int j = 0; j <= cont; j++) {
			pow *= 10;
		}
		while (i<=pow || (!capicua)) {
			if (numMod % (pow) == numMod % 10 * i) {
				nuevocont++;
			
			}
			i *= 10;
			pow /= 10;
			if (nuevocont == cont) {
				capicua = true;
			}
		}
		if (capicua) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}

	}

}
