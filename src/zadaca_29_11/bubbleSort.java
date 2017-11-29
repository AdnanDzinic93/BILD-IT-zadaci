package zadaca_29_11;

public class bubbleSort {
	public static int[] bubble(int[] niz) {
		int zamjena;
		do {
			zamjena = 0;
			for (int i = 0; i < niz.length - 1; i++) {
				if (niz[i] > niz[i + 1]) {
					niz[i] = niz[i + 1] + niz[i];
					niz[i + 1] = niz[i] - niz[i + 1];
					niz[i] = niz[i]-niz[i+1];
					zamjena++;
				}
			}
		} while (zamjena != 0);
		return niz;
	}

	public static void main(String[] args) {
		int [] niz= {5,1,4,2,8};
		for(int i=0;i<niz.length;i++) {
			System.out.print(bubble(niz)[i]+" ");
		}

	}

}
