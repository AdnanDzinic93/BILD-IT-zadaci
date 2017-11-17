package zadaca_16_11;

import java.util.Scanner;

public class novcicGlavaPismo {
	public static void novcicGlavaPismo(int n) {
		int pismo = 0, glava = 0;
		for (int i = 1; i <= n; i++) {
			int test = (int) (Math.random() * 2);
			if (test == 0) {
				pismo++;
			} else {
				glava++;
			}
		}
		System.out.println("Glava je pala " + glava + " puta a pismo " + pismo + " puta");
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj");
		int korisnik = unos.nextInt();
		novcicGlavaPismo(korisnik);
	}
}
