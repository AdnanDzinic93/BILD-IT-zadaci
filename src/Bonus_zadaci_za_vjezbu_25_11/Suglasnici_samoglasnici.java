package Bonus_zadaci_za_vjezbu_25_11;

import java.util.Scanner;

public class Suglasnici_samoglasnici {
	public static void daLiJeSamoglasnik(char slovo) {
		if(Character.isLetter(slovo)==false) {
			System.out.println("Unos nije slovo");
		}
		else if(slovo=='A'||slovo=='E'||slovo=='I'||slovo=='O'||slovo=='U'||slovo=='a'||slovo=='e'||slovo=='i'||slovo=='o'||slovo=='u') {
			System.out.println("Uneseno slovo je samoglasnik");
		}
		else {
			System.out.println("Uneseno slovo je suglasnik");
		}
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite slovo");
		String korisnik=unos.next();
		char slovo=korisnik.charAt(0);
		daLiJeSamoglasnik(slovo);
	}

}
