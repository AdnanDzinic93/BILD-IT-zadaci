package zadaca_8_11;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = unos.nextInt(), brojac = 0, naopakoBroj = 0;
		while (broj / 10 != 0) {
			brojac++;
			naopakoBroj = broj % 10 * 10 + naopakoBroj * 10;
			broj = broj / 10;
		}
		System.out.println(naopakoBroj + broj);

	}

}
