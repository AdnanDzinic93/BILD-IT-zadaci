package zadaca_15_11;

public class EmirpBrojevi {
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

	public static int brojObrnut(int n) {
		int m = 0;
		while (n > 0) {
			m = m * 10 + n % 10;
			n /= 10;
		}
		return m;
	}

	public static boolean isEmirp(int n) {
		boolean rezultat;
		if (isPrime(n) == true) {
			int m = brojObrnut(n);
			if (isPrime(m) == true) {
				rezultat = true;
			} else {
				rezultat = false;
			}
		} else {
			rezultat = false;
		}
		return rezultat;
	}

	public static void main(String[] args) {
		int brojac = 0;
		for (int i = 11; i < 10000000; i++) {
			if (isEmirp(i) == true) {
				brojac++;
				if (brojac % 10 != 0) {
					System.out.print(i + " ");
				} else {
					System.out.println(i + " ");
				}
			}
			if (brojac == 100) {
				break;
			}
		}
	}
}

