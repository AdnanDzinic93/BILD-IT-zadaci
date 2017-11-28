package zadaca_28_11;

import java.util.Scanner;

public class sortirajStudentePoOcjenama {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj studenata");
		int brojStudenata = unos.nextInt();
		String[] imena = new String[brojStudenata];
		int[] ocjene = new int[brojStudenata];
		System.out.println("Unesite ime studenta pa ocjenu");
		for (int i = 0; i < brojStudenata; i++) {
			imena[i] = unos.next();
			System.out.print("");
			ocjene[i] = unos.nextInt();
		}
		for (int i = 0; i < ocjene.length; i++) {
			int trenutniNajveci = ocjene[i];
			String trenutniNajveciIme = imena[i];
			int trenutniNajveciIndeks = i;
			for (int j = i + 1; j < ocjene.length; j++) {
				if (trenutniNajveci < ocjene[j]) {
					trenutniNajveci = ocjene[j];
					trenutniNajveciIme = imena[j];
					trenutniNajveciIndeks = j;
				}
			}

			if (trenutniNajveciIndeks != i) {
				ocjene[trenutniNajveciIndeks] = ocjene[i];
				imena[trenutniNajveciIndeks] = imena[i];
				ocjene[i] = trenutniNajveci;
				imena[i] = trenutniNajveciIme;
			}
		}
		for (int i = 0; i < ocjene.length; i++) {
			System.out.println(imena[i] + ":" + ocjene[i] + " ");
		}
	}
}
