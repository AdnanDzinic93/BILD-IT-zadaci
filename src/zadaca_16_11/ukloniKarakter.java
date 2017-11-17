package zadaca_16_11;

import java.util.Scanner;

public class ukloniKarakter {
	public static String ukloniKarakter(String str, char ch) {
		String izlaz = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				izlaz += str.charAt(i);
			}
		}
		return izlaz;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite svoj recenicu");
		String recenica = unos.nextLine();
		System.out.print("Unesite svoje slovo");
		String slovoo = unos.next();
		char slovo = slovoo.charAt(0);
		System.out.println("Recenica " + recenica + "\" bez " + slovo + " izgleda ovako " + ukloniKarakter(recenica, slovo));

	}

}
