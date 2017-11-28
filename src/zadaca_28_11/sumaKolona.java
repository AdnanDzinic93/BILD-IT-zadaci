package zadaca_28_11;

import java.util.Scanner;

public class sumaKolona {
	public static double sumirajKolonu(double[][] niz, int kolona) {
		double suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i][kolona-1];
		}
		return suma;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double[][] niz = new double[4][4];
		System.out.print("Molimo vas unesite " + niz.length + " redova i " + niz[0].length + " kolona: ");

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = unos.nextDouble();
			}
		}
		System.out.println("Zbir svih elemenata u koloni 0 je: " + sumirajKolonu(niz, 1));
		System.out.println("Zbir svih elemenata u koloni 0 je: " + sumirajKolonu(niz, 2));
		System.out.println("Zbir svih elemenata u koloni 0 je: " + sumirajKolonu(niz, 3));
		System.out.println("Zbir svih elemenata u koloni 0 je: " + sumirajKolonu(niz, 4));

	}

}
