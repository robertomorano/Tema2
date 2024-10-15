package bolentin4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// Variables para operar
		int num1, num2 = 0;
		double media = 0;
		// Un contador para ver cunantos numero han sido introducidos
		int contador = 0;
		int contador0 = 0;
		int contadorNegativo = 1;
		Scanner sc = new Scanner(System.in);
		while (contador <= 0){
			System.out.println("Dame numeros");
			num1 = sc.nextInt();
			if (num1 > 0) {
				num2 += num1;
			}else if(num1 < 0) {
				media += num1;
				contadorNegativo++;
			}else {
				contador0++;
			}
			
			num2 += num1;
			contador++;
		}
		if (contadorNegativo == 0)
		media = (double)media/contadorNegativo;
		System.out.println((media)+" has introduciodo "+contador0+"ceros"
				+num2+"es la suma");
		sc.close();

	}

}
