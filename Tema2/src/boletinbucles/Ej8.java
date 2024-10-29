package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		boolean error = false;
		int num=1;
		int numAnt = 0;
		int cont=0;
		int fallos=0;
		Scanner sc = new Scanner(System.in);
		do {
			if (num>numAnt) {
				numAnt = num;
				cont++;
			}else {
				System.out.println("Fallo es menor");
				fallos++;
			}
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


		} while (error||num!=0);
		System.out.println("Final "+cont+" fallos"+fallos);
	}

}
