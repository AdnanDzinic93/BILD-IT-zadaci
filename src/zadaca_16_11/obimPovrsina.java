package zadaca_16_11;

import java.util.Scanner;

public class obimPovrsina {
	public static double obim(double stranica) {
		double obim = 4 * stranica;
		return obim;
	}

	public static double povrsina(double stranica) {
		double povrsina = stranica * stranica;
		return povrsina;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite stranicu kvadrata");
		int korisnik = unos.nextInt();
		System.out.println("Povrsina kvadrata je " + povrsina(korisnik) + " a obim je " + obim(korisnik));
	}
}
