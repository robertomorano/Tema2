package boletinbucles;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		//variables a pedir
		int a,b,i=1;
		//variable mayor menor
		int mayor=0,menor=0;
		boolean mcn=true;
		Scanner sc = new Scanner(System.in);
		//Preguntamos al usuario
		System.out.println("Dame un numero");
		a = sc.nextInt();
		System.out.println("Dame otro numero");
		b = sc.nextInt();
		if (a>b) {
			mayor=a;
			menor=b;
		}else {
			mayor=b;
			menor=a;
		}
		i=mayor;
		while(mcn){
			if ((i%mayor==0)&&(i%menor==0)) {
				System.out.println(i+" es el minimo");
				mcn=false;
			}
			i++;
		}
	}

}
