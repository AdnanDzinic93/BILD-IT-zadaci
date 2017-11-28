package zadaca_28_11;

import java.util.Scanner;

public class sumaDiagonala {
	public static double sumirajSilaznuDijagonalu(double[][] niz) {
		double suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i][i];
		}
		return suma;
	}
	public static double sumirajUzlaznuDijagonalu(double[][] niz) {
		double suma = 0;
		for (int i = 0; i <niz.length; i++) {
			
			suma += niz[i][niz.length-i-1];
			
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
		System.out.println("Suma svih elemenata duz silazne dijagonale je: "+sumirajSilaznuDijagonalu(niz));
		System.out.println("Suma svih elemenata duz uzlazne dijagonale je: "+sumirajUzlaznuDijagonalu(niz));
	}

}
