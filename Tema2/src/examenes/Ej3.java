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
		int espMedio=0;
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
		numMod=1;
		espMedio=(((num-2)*2)-1);
		for(int i=0;i<num;i++) {
			System.out.print("* ");
		}
		System.out.print("\n");
		for(int j=1;j<num;j++) {
			if (j==num-1) {
				for(int i=1;i<num;i++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}else {
				for (int i = 0;i<numMod;i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int i=espMedio;i>0;i--) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println("");
				espMedio-=2;
				numMod++;
			}
		}
	}
}
