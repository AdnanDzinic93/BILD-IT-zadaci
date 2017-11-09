package zadaca_9_11;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite iznos koji zelite platiti");
		int iznosIsplate = unos.nextInt(), brojac1 = 0, brojac3 = 0, brojac5 = 0, ukupnoKovanica;
		ukupnoKovanica = iznosIsplate;
		for (int i = 0; i <= iznosIsplate; i++) {
			for (int j = 0; j <= iznosIsplate / 3; j++) {
				for (int k = 0; k <= iznosIsplate / 5; k++) {
					if (ukupnoKovanica > i + j + k) {
						if (iznosIsplate == i + j * 3 + k * 5) {
							ukupnoKovanica = i + j + k;
							brojac1 = i;
							brojac3 = j;
							brojac5 = k;
						}
					}

				}
			}
		}

		System.out.println("Broj potrebnih novcica: " + (brojac1 + brojac3 + brojac5) + " i to " + brojac1
				+ " od jedne marke " + brojac3 + " od tri marke i " + brojac5 + " od pet maraka");

	}

}
