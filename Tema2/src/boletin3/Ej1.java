package boletin3;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int num1;
		//variable con la que operamos
		int n;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Dame un numero");
		// Leer el numero introducido por pantalla
		num1 = sc.nextInt();
		if ((num1>=0)&&(num1<10000)) {
			if (num1 < 10) {
				System.out.println("Es capicua pues solo tiene una cifra");
			}else if(num1 < 100){
				n = num1%10;
				if (n == (num1/10)) {
					System.out.println("Es capicua");}
				}else if(num1 <1000) {
					n = num1%10;
					if (n == (num1/100)) {
						System.out.println("Es capicua");};
				}else if(num1<10000) {
					n = num1%10;
					if (n == (num1/1000)) {
						n = (((num1%1000)%100)%10);
						if (n == num1/100);
						}
				}
		}else{
			System.out.println("Numero fuera de rango");
		}
		

	}

}
