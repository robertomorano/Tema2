package examenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		boolean error = false;
		int num=0;
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
		for(int i =0;i<num;i++){
			System.out.print("*");
		}
		System.out.print("\n");
		for(int j=0; j<num-2;j++) {
			for(int i=0;i<num;i++) {
				if(i==0||i==num-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
				System.out.print("\n");
			
		}
		for(int i =0;i<num;i++){
			System.out.print("*");
		}
		sc.close();
	}

}
