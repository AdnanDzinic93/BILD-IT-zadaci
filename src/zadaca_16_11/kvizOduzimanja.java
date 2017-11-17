package zadaca_16_11;

import java.util.Scanner;

public class kvizOduzimanja {
	public static int max(int num1, int num2) {
		int max;
		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		return max;
	}

	public static void kvizOduzimanja(int n) {
		Scanner unos = new Scanner(System.in);
		int tacno = 0, netacno = 0;
		while (n > 0) {
			int broj1 = (int) (Math.random() * 10), broj2 = (int) (Math.random() * 10),
					min = broj1 + broj2 - max(broj1, broj2);
			System.out.println("Koliko je " + max(broj1, broj2) + " - " + min);
			int korisnik = unos.nextInt();
			if (korisnik == max(broj1, broj2) - min) {
				tacno++;
			} else {
				netacno++;
			}
			n--;
		}
		System.out.println("Netacnih odgovora je " + netacno + " a tacnih " + tacno);
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj");
		int korisnik = unos.nextInt();
		kvizOduzimanja(korisnik);
	}

}
