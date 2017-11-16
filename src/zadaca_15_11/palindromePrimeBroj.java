package zadaca_15_11;

public class palindromePrimeBroj {
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

	public static boolean isPalindrome(int n) {
		boolean rezultat = false;
		if (n == brojObrnut(n)) {
			rezultat = true;
		}
		return rezultat;
	}

	public static boolean palindromePrimeBroj(int n) {
		boolean rezultat = false;
		if (isPalindrome(n) == true && isPrime(n) == true) {
			rezultat = true;
		}
		return rezultat;
	}

	public static void main(String[] args) {
		int brojac = 0;
		for (int i = 100; i < 1000000000; i++) {
			if (palindromePrimeBroj(i) == true) {
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
