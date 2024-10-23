package boletin5;

import java.awt.image.TileObserver;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// Declarar constantes
		final String PIEDRA = "piedra";
		final String PAPEL = "papel";
		final String TIJERAS = "tijeras";
		String resp1, resp2;
		// variable para cancelar partida
		String cont;
		Scanner sc = new Scanner(System.in);
		// iniciamos bucle de partida
		do {
			// Preguntamos
			do {
				System.out.println("piedra papel o tijeras");
				// Leer el numero introducido por pantalla
				resp1 = sc.nextLine();
			} while (!(resp1.equals(PIEDRA) || resp1.equals(TIJERAS) || resp1.equals(PAPEL)));
			
			do {
				System.out.println("piedra papel o tijeras");
				// Leer el numero introducido por pantalla
				resp2 = sc.nextLine();
			} while (resp2.equals(PIEDRA) || resp2.equals(TIJERAS) || resp2.equals(PAPEL));
			
			if ((resp1.equals(resp2))) {
				System.out.println("Empate");
			} else if ((resp1.equals(PAPEL)) && (resp2.equals(PIEDRA))
					|| (resp1.equals(TIJERAS)) && (resp2.equals(PAPEL))
					|| (resp1.equals(PIEDRA)) && (resp2.equals(TIJERAS))) {
				System.out.println("Gana jugador 1 ");
			} else  {
				System.out.println("Gana jugador 2");
			}
			System.out.println("piedra papel o tijeras");
			// Leer el numero introducido por pantalla
			cont = sc.nextLine();
		} while (!(cont.equals("s")));
		sc.close();
	}

}
