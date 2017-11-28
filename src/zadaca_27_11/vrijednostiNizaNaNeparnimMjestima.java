
package zadaca_27_11;

import java.util.Scanner;

public class vrijednostiNizaNaNeparnimMjestima {
	public static int[] vrtineparnaMjesta(int[] niz) {
		int[] neparni = new int[niz.length / 2 ];
		for (int i = 0; i < niz.length; i += 2) {
			neparni[i / 2] = niz[i];
		}
		return neparni;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("unesite niz brojeva");
		int[] nizBrojeva = new int[6];
		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva[i] = unos.nextInt();
		}
		for (int i = 0; i < vrtineparnaMjesta(nizBrojeva).length; i++) {
			System.out.println(vrtineparnaMjesta(nizBrojeva)[i]);
		}
	}
}