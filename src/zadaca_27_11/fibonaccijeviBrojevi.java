package zadaca_27_11;

import java.util.Scanner;

public class fibonaccijeviBrojevi {
	public static int[] stoFibonaccijevih(int broj1, int broj2) {
		int[] niz = new int[100];
		niz[0] = broj1;
		niz[1] = broj2;
		for (int i = 2; i < 100; i++) {
			niz[i] = niz[i - 1] + niz[i - 2];
		}
		return niz;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("unsite prva dva clana Fibonaccijevog niza");
		int broj1 = unos.nextInt(), broj2 = unos.nextInt();
		for (int i = 0; i < 100; i++) {
			System.out.println(stoFibonaccijevih(broj1, broj2)[i]);
		}

	}

}
