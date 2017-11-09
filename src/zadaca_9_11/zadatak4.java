package zadaca_9_11;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		char slovo;
		int brojac = 0;
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String korisnik = unos.nextLine();
		for (int i = 0; i < korisnik.length(); i++) {
			slovo = korisnik.charAt(i);
			if (Character.isUpperCase(slovo)) {
				brojac++;
			}
		}
		System.out.println("Velikih slova je " + brojac);
	}

}
