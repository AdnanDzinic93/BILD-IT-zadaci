import java.util.Scanner;

public class najveciElementMatrice {
	public static int[] najveciElement(int[][] niz) {
		int[] izlaz = new int[2];
		int pomocna = 0;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if (niz[i][j] > pomocna) {
					pomocna = niz[i][j];
					izlaz[0] = i;
					izlaz[1] = j;
				}
			}

		}
		return izlaz;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int[][] niz = new int[4][4];
		System.out.print("Molimo vas unesite " + niz.length + " redova i " + niz[0].length + " kolona: ");

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = unos.nextInt();
			}
		}
		System.out.println("Lokacija najveæeg elementa: (" + najveciElement(niz)[0] + "," + najveciElement(niz)[1] + ")");
	}
}
