package zadaca_13_11;

import java.util.Scanner;

public class StopeUMetre {
	public static double stopeUMetre(double stope) {
		double metri = stope * 0.305;
		return metri;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite stope");
		double stope = unos.nextDouble();
		System.out.println(stope + " stopa je " + stopeUMetre(stope) + " metara");

	}

}
