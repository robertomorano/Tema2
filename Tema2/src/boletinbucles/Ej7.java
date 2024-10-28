package boletinbucles;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		// Preguntamos al usuario
		System.out.println("Dame un numero");
		num = sc.nextInt();
		for(int i=0;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}
			System.out.print("\n");
		}
	}

}
