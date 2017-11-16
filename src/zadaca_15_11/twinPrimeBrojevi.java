package zadaca_15_11;

public class twinPrimeBrojevi {
	public static boolean isPrime(int n) {
		boolean rezultat = true;
		for (int i = 2; i <= (n / 2); i++) {
			if (n % i == 0) {
				rezultat = false;
				break;
			}
		}
		return rezultat;
	}

	public static boolean isTwinPrime(int i) {
		boolean rezultat = false;
		if (isPrime(i) == true) {
			if (isPrime(i + 2) == true) {
				rezultat = true;
			}
		}
		return rezultat;
	}

	public static void main(String[] args) {
		int brojac = 0;
		for (int i = 3; i < 10000; i++) {
			if (isTwinPrime(i) == true) {
				brojac++;
				if (brojac % 10 != 0) {
					System.out.print("[" + i + " " + (i + 2) + "] ");
				} else {
					System.out.println("[" + i + " " + (i + 2) + "] ");
				}
			}
			if (brojac == 100) {
				break;
			}
		}

	}

}
