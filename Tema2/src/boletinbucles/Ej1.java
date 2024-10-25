package boletinbucles;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		//variables que se le piden al usuario
		int hour, min, sec, secplus;
		Scanner sc = new Scanner(System.in);
		//Preguntamos al usuario
		System.out.println("Dame la hora");
		hour = sc.nextInt();
		System.out.println("Dame los minutos");
		min = sc.nextInt();
		System.out.println("Dame los segundos");
		sec = sc.nextInt();
		System.out.println("Cuantos segundos quieres incrementar");
		secplus = sc.nextInt();
		for(int i = 1; i <= secplus;i++) {
			sec++;
			if (sec==60) {
				min++;
				sec=0;
			}
			if(min==60) {
				hour++;
				min=0;
			}
		}
		System.out.println(hour+":"+min+":"+sec);
		sc.close();

	}

}
