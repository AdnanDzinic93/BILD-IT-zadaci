package zadaca_29_11;

public class jedniceINule {
	public static int sumirajKolonu(int[][] niz, int kolona) {
		int suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i][kolona];
		}
		return suma;
	}

	public static int sumirajVrstu(int[][] niz, int vrsta) {
		int suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma += niz[vrsta][i];
		}
		return suma;
	}

	public static void main(String[] args) {
		int[][] matrica = new int[4][4];
		int kolona = 0, vrsta = 0, sum = 0;
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = (int) (Math.random() * 2);
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println("");
		}
		for (int i = 0; i < 4; i++) {
			if (sum < sumirajKolonu(matrica, i)) {
				sum = sumirajKolonu(matrica, i);
				kolona = i;
			}
		}
		System.out.println("Kolona sa najviše jedinica:" + (kolona + 1));
		sum = 0;
		for (int i = 0; i < 4; i++) {
			if (sum < sumirajVrstu(matrica, i)) {
				sum = sumirajVrstu(matrica, i);
				vrsta = i;
			}
		}
		System.out.println("Vrsta sa najviše jedinica:" + (vrsta + 1));
	}

}
