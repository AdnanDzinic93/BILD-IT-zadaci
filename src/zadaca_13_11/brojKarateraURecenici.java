package zadaca_13_11;

import java.util.Scanner;

public class brojKarateraURecenici {
	public static int brojacKaraktera(String str, char ch) {
		int brojSlova = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				brojSlova++;
			}
		}
		return brojSlova;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String recenica = unos.nextLine();
		System.out.println("Unesite slovo");
		String slovoo = unos.next();
		char slovo = slovoo.charAt(0);
		System.out
				.println("U recenici" + recenica + " slovo" + slovo + "javlja se " + brojacKaraktera(recenica, slovo));

	}

}