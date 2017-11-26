package Bonus_zadaci_za_vjezbu_25_11;

import java.util.Scanner;

public class stariMobiteli {
	public static int vratiBroj(char slovo) {
		int broj = 0;
		if (Character.isLetter(slovo) == false) {
			System.out.println("Unos nije slovo");
		} else if (slovo == 'A' || slovo == 'a' || slovo == 'B' || slovo == 'b' || slovo == 'C' || slovo == 'c') {
			broj = 2;
		} else if (slovo == 'D' || slovo == 'd' || slovo == 'E' || slovo == 'e' || slovo == 'F' || slovo == 'f') {
			broj = 3;
		} else if (slovo == 'G' || slovo == 'g' || slovo == 'H' || slovo == 'h' || slovo == 'I' || slovo == 'i') {
			broj = 4;
		} else if (slovo == 'J' || slovo == 'j' || slovo == 'K' || slovo == 'k' || slovo == 'L' || slovo == 'l') {
			broj = 5;
		} else if (slovo == 'M' || slovo == 'm' || slovo == 'N' || slovo == 'n' || slovo == 'O' || slovo == 'o') {
			broj = 6;
		} else if (slovo == 'P' || slovo == 'p' || slovo == 'Q' || slovo == 'q' || slovo == 'R' || slovo == 'r'
				|| slovo == 'S' || slovo == 's') {
			broj = 7;
		} else if (slovo == 'T' || slovo == 't' || slovo == 'U' || slovo == 'u' || slovo == 'V' || slovo == 'v') {
			broj = 8;
		} else if (slovo == 'W' || slovo == 'w' || slovo == 'X' || slovo == 'x' || slovo == 'y' || slovo == 'Y'
				|| slovo == 'Z' || slovo == 'z') {
			broj = 9;
		}
		return broj;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite slovo");
		String korisnik = unos.next();
		char slovo = korisnik.charAt(0);
		System.out.println("Odgovarajuæi broj je " + vratiBroj(slovo));
	}

}
