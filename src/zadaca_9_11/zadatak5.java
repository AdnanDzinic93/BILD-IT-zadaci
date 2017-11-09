package zadaca_9_11;

import java.util.Scanner;

public class zadatak5 {

	public static void main(String[] args) {
		char slovo;
		int brojac = 0;
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite password");
		String korisnik = unos.nextLine();
		if (korisnik.length() < 8) {
			System.out.println("Password je kratak i treba da sadrzi 8 karaktera");
		}
		for (int i = 0; i < korisnik.length(); i++) {
			slovo = korisnik.charAt(i);
			if (Character.isDigit(slovo) || Character.isLetter(slovo)) {
				if (Character.isDigit(slovo)) {
					brojac++;
				}
			} else {
				System.out.println(" Password smije da se sastoji samo od slova i brojeva.");
			}
		}
		if (brojac < 2) {
			System.out.println("Password mora sadržati najmanje 2 broja.");
		}
	}

}
