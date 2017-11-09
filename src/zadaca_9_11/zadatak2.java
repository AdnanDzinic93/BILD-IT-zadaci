package zadaca_9_11;

public class zadatak2 {

	public static void main(String[] args) {
		int palindrom = 0;
		int[] niz = new int[1001];
		for (int i = 0; i < 1001; i++) {
			niz[i] = i;
		}
		for (int i = 1; i < 1001; i++) {
			if (niz[i] != 0) {
				for (int j = i; j < 1000 / i + 1; j++) {
					niz[niz[i] * j] = 0;
				}
			}
		}
		for (int i = 100; i < 1001; i++) {
			if (niz[i] % 10 == niz[i] / 100 && niz[i] != 0) {
				palindrom = niz[i];
			}
		}
		System.out.println(palindrom);
	}

}
