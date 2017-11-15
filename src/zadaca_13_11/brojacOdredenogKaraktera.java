package zadaca_13_11;

import java.util.Scanner;

public class brojacOdredenogKaraktera {
	public static int brojacKaraktera(String str, char ch) {
		int brojac = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				brojac++;
			}
		}
		return brojac;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite svoj recenicu");
		String recenica = unos.nextLine();
		System.out.print("Unesite svoje slovo");
		String slovoo = unos.next();
		char slovo = slovoo.charAt(0);
		System.out.println("Recenica " + recenica + "\" je sastavljen od: " + brojacKaraktera(recenica, slovo) + " slova" + slovo);
	}

}
