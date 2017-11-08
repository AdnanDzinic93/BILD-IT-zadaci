package zadaca_8_11;

import java.util.Scanner;

public class zadtak5a {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = unos.nextInt();
		for (int i = 1; i <= broj; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

}
