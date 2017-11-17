package zadaca_16_11;

import java.util.Scanner;

public class formatBroja {
	public static String format(int number, int width) {
		 return String.format("%0" + width + "d", number);
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite svoj broj");
		int broj=unos.nextInt();
		System.out.print("Unesite format broja");
		int formatt=unos.nextInt();
		System.out.println(format(broj,formatt));

	}

}
