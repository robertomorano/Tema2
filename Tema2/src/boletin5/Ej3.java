package boletin5;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		//
		int numero, n2 = 0;
		int n1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		numero = sc.nextInt();
		do {
			n1 += n2;
			n2++;
		} while (n2 <= numero);
		System.out.println(n1);
		sc.close();
	}

}
