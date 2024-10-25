package boletinbucles;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int a,b,i=0;
		//variable mayor menor
		int mayor=0,menor=0;
		boolean mcd=true;
		Scanner sc = new Scanner(System.in);
		//Preguntamos al usuario
		System.out.println("Dame la hora");
		a = sc.nextInt();
		System.out.println("Dame los minutos");
		b = sc.nextInt();
		if (a>b) {
			mayor=a;
			menor=b;
		}else {
			mayor=b;
			menor=a;
		}
		i= menor;
		while((i>0)&&(mcd)){
			if ((menor%i==0)&&(mayor%i==0)) {
				System.out.println(i+" es el maximo");
				mcd=false;
			}
			i--;
		}
	}

}
