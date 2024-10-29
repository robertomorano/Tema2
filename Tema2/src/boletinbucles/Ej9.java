package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		boolean error = false;
		int num=1;
		int numMod = 0;
		int cont=0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Dame un numero");
				num = sc.nextInt();
				error=false;
			} catch (InputMismatchException e) {
				error=true;
				System.out.println(e.getMessage());
			}finally {
				sc.nextLine();
			}
		} while (error||num<0);
		numMod=num;
		while(numMod>1) {
			numMod/=10;
			cont++;
		}
		System.out.println(cont);
	}

}
