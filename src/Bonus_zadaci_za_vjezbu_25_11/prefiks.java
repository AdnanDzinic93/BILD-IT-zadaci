package Bonus_zadaci_za_vjezbu_25_11;

import java.util.Scanner;

public class prefiks {

	public static void prefiks(String jedan, String dva) {
		int brojac = 0;
		for (int i = 0; i < jedan.length(); i++) {
			if (jedan.charAt(i) == dva.charAt(i)) {
				while (brojac == 0) {
					System.out.print("Zajednici prefiks za dva stringa je: ");
					brojac++;
				}
				System.out.print(jedan.charAt(i));

			} else {
				if (brojac == 0) {
					System.out.print("Stringovi " + jedan + " i " + dva + " nemaju zajednicki prefiks.");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite prvu recenicu");
		String korisnikPrvi = unos.nextLine();
		System.out.println("Unesite drugu recenicu");
		String korisnikDrugi = unos.nextLine();
		prefiks(korisnikPrvi, korisnikDrugi);

	}

}
