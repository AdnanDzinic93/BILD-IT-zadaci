package zadaca_13_11;

import java.util.Scanner;

public class zadatak3 {
	public static int prebrojiSlova(String s) {
		int brojSlova = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				brojSlova++;
			}
		}
		return brojSlova;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String recenica = unos.nextLine();
		System.out.println("broj slova u recenici je " + prebrojiSlova(recenica));

	}
}
