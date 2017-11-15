package zadaca_13_11;

public class prostBroj {
	public static boolean isProstiBroj(int broj) {
		boolean rezultat = true;
		for (int i = 2; i <= (broj / 2); i++) {
			if (broj % i == 0) {
				rezultat = false;
				break;
			}
		}
		return rezultat;
	}

	public static void main(String[] args) {
		for (int i = 2; i <= 10000; i++) {
			if (isProstiBroj(i) == true) {
				System.out.println(i);
			}
		}
	}
}
