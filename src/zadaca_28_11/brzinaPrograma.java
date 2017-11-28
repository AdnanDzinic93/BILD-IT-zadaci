package zadaca_28_11;

import java.util.Scanner;

public class brzinaPrograma {
	public static int linear(int[] niz, int kljuc) {
		long pocetakMjerenja = System.currentTimeMillis();
		for (int i = 0; i < niz.length; i++) {
		if (kljuc == niz[i]) {
		return i;
		}
		}
		return -1;
		}
	

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
        int[] niz = new int[100000];

        for (int i = 0; i < 100000; i++) {
            niz[i] = (int)(Math.random()*1000);
        }
        System.out.println("Unesite kljuc");
        int kljuc=unos.nextInt();
        long pocetakMjerenja = System.currentTimeMillis();
        linear(niz,kljuc);
        long krajMjerenja = System.currentTimeMillis();
        System.out.println("Potrebno vrijeme za pretrazivanje pomocu linear metode je: "+(krajMjerenja - pocetakMjerenja)+" "+ linear(niz,kljuc));

	}

}
