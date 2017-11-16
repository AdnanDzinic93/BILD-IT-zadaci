package zadaca_15_11;

public class prostBroj {
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

	public static void main(String[] args) {
		for (int i = 2; i <= 100000; i++) {
			if (isPrime(i) == true) {
				System.out.println(i);
			}
		}
	}
}
