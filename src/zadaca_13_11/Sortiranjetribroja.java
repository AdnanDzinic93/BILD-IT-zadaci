package zadaca_13_11;

import java.util.Scanner;

public class Sortiranjetribroja {
	public static void ispisiSortiraneBrojeve(double broj1, double broj2, double broj3) {
		if (broj1 > broj2 && broj1 < broj3) {
			broj1 = broj1 + broj2;
			broj2 = broj1;
			broj1 = broj1 - broj2;
		} else if (broj3 < broj1 && broj2 > broj1) {
			broj1 = broj1 + broj3;
			broj3 = broj1;
			broj1 = broj1 - broj3;
		} else if (broj2 < broj3) {
			broj2 = broj2 + broj3;
			broj3 = broj2;
			broj2 = broj2 - broj3;
		}
		System.out.println("Redosljed unesenih brojeva je" + broj1 + " " + broj2 + " " + broj3);

	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite tri broja");
		double broj1 = unos.nextDouble(), broj2 = unos.nextDouble(), broj3 = unos.nextDouble();
		ispisiSortiraneBrojeve(broj1, broj2, broj3);

	}
}