package boletini1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("Introduce un numero");
		// Leer el numero introducido por pantalla
		n1 = sc.nextInt();
		// Preguntamos
		System.out.println("Introduce otro");
		// Leer el numero introducido por pantalla
		n2 = sc.nextInt();
		if (n1 == n2) {
			System.out.println("Son iguale");
		}else {
			System.out.println("No lo son");
		}
		sc.close();
	}

}


