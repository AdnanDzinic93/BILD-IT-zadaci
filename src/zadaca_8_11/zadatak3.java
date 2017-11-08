package zadaca_8_11;

public class zadatak3 {

	public static void main(String[] args) {
		int brojac = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 4 == 0 && i % 5 != 0) {
				brojac++;
				if (brojac % 10 != 0) {
					System.out.print(i + " ");
				} else {
					System.out.println(i + " ");
				}
			}

		}
	}

}
