package zadaca_13_11;

import java.util.*;

public class brojacKaraktera {
	public static int prebrojiSlova(String s) {
		int brojac = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				brojac++;
			}
		}
		return brojac;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite svoj recenicu");
		String recenica = unos.nextLine();
		System.out.println("Recenica " + recenica + "\" je sastavljen od: " + prebrojiSlova(recenica));
	}

}
