package zadaca_8_11;

import java.util.Scanner;

public class zadatak5d {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = unos.nextInt();
		for (int i = broj; i >= 1; i--) {
			for (int j = 1; j <= broj-i  ; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}

}
