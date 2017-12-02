import java.util.Scanner;

public class nizSortiranIliNe {
	public static boolean isSortiran(int[] niz) {
		boolean rezultat = true;
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz[i] > niz[i + 1]) {
				rezultat = false;
			}
		}
		return rezultat;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite velicinu niza");
		int velicina = unos.nextInt();
		System.out.println("Unesite niz brojeva");
		int[] nizBrojeva = new int[velicina];
		for (int i = 0; i < nizBrojeva.length; i++) {
			nizBrojeva[i] = unos.nextInt();
		}
		if (isSortiran(nizBrojeva) == true) {
			System.out.println("Uneseni niz je sortiran.");
		} else {
			System.out.println("Uneseni niz nije sortiran.");
		}
	}

}
