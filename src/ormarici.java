
public class ormarici {

	public static void main(String[] args) {
		// nas niz od 100 ,jesta biti ce ormarici. sa vrijednosti 1 biti otvoren sa
		// nulom zatvoren
		int[] niz = new int[100];
		// Prvi ucenik ne mjenja stanje u vecoj mjeri kako ce to radi drugi ucenik
		for (int i = 1; i <= 100; i++) {
			for (int j = i-1; j < 100; j+=i) {
					if (niz[j] == 0) {
						niz[j] = 1;
					} else {
						niz[j] = 0;
					}	
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("ormaric broj " + i + " " + niz[i]);
		}

	}

}
