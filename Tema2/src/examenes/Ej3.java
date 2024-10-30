package examenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
/*	* * * * * 
	 *     *
	  *   *
	   * *
	    * 

		 * */
		boolean error = false;
		int num=0;
		int numMod=0;
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
		for(int i=0;i<numMod;i++) {
			System.out.print("* ");
		}
		System.out.print("\n");
		for(int j=0)
	}
}
