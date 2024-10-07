package Boletinifrlse;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		//
		final String PIEDRA = "piedra";
		final String PAPEL = "papel";
		final String TIJERAS = "tijeras";
		String resp1, resp2;
		Scanner sc = new Scanner(System.in);
		// Preguntamos
		System.out.println("piedra papel o tijeras");
		// Leer el numero introducido por pantalla
		resp1 = sc.nextLine();
		System.out.println("piedra papel o tijeras");
		// Leer el numero introducido por pantalla
		resp2 = sc.nextLine();
		if ((resp1.equals(PIEDRA)) && (resp2 == PIEDRA) || (resp1 == PAPEL) && (resp2 == PAPEL)
				|| (resp1 == TIJERAS) && (resp2 == TIJERAS)) {
			System.out.println("Empate");
		} else if ((resp1 == PAPEL) && (resp2 == PIEDRA) || (resp1 == TIJERAS) && (resp2 == PAPEL)
				|| (resp1 == PIEDRA) && (resp2 == TIJERAS)) {
			System.out.println("Gana jugador 1 ");
		} else if (((resp2 == PAPEL) && (resp1 == PIEDRA) || (resp2 == TIJERAS) && (resp1 == PAPEL)
				|| (resp2 == PIEDRA) && (resp1 == TIJERAS))) {
			System.out.println("Gana jugador 2");
		} else {
			System.out.println("Introduce piedra papel o tijeras");
		}
		sc.close();
	}

}
