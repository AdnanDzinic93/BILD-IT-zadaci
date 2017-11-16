package zadaca_15_11;

import java.util.Scanner;

public class rastuciRedosljed {
	public static double min(double num1, double num2) {
		double min;
		if (num1 < num2) {
			min = num1;
		} else {
			min = num2;
		}
		return min;
	}

	public static void ispisiSortiraneBrojeve(double num1, double num2, double num3) {
		double a = min(min(num1, num2), num3), b = 0, c = 0;
		if (a == num1) {
			b = min(num2, num3);
			c = num2 + num3 - b;
		} else if (a == num2) {
			b = min(num1, num3);
			c = num1 + num3 - b;
		} else {
			b = min(num1, num2);
			c = num1 + num2 - b;
		}
		System.out.println(a + " " + b + " " + c);

	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite tri broja");
		double broj1 = unos.nextDouble(), broj2 = unos.nextDouble(), broj3 = unos.nextDouble();
		ispisiSortiraneBrojeve(broj1, broj2, broj3);
	}

}
