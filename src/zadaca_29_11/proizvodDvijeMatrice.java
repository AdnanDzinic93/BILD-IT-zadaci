package zadaca_29_11;

import java.util.Scanner;

public class proizvodDvijeMatrice {
	public static double[][] pomnoziMatrice(double[][] a, double[][] b) {
		double[][] proizvodMatrica = new double[a.length][b[0].length];
		if (b.length != a[0].length) {
			System.out.println("Pogresan format");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					proizvodMatrica[i][j] += a[i][k] * b[k][i];
				}
			}
		}
		return proizvodMatrica;

	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double[][] niz = new double[3][3], niz1 = new double[3][3];
		System.out.print("Molimo vas unesite " + niz.length + " redova i " + niz[0].length + " kolona: ");

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = unos.nextDouble();
			}
		}
		System.out.print("Molimo vas unesite " + niz1.length + " redova i " + niz1[0].length + " kolona: ");

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz1[i].length; j++) {
				niz1[i][j] = unos.nextDouble();
			}
		}
		for (int i = 0; i < pomnoziMatrice(niz, niz1).length; i++) {
			for (int j = 0; j < pomnoziMatrice(niz, niz1)[0].length; j++) {
				System.out.print(pomnoziMatrice(niz, niz1)[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
