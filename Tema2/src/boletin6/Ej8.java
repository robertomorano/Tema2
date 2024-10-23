package boletin6;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		//variable que se le pedira al usuario
		int num1, num2;
		//variable para el mayor y el menor
		int mayor=0,menor=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		num1 = sc.nextInt();
		System.out.println("Dame otro numero");
		num2 = sc.nextInt();
		if(num1>num2){
			mayor=num1;
			menor=num2;
		}else {
			mayor=num2;
			menor=num1;
		}
		for(int i = menor; i <= mayor;i++) {
			System.out.print(i+" ");
		}

	}

}
