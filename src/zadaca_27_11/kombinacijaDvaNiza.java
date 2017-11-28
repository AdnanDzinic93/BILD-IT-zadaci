package zadaca_27_11;

public class kombinacijaDvaNiza {
	public static int[] kombiniraj(int[] niz1, int[] niz2) {
		int[] kombinovan = new int[niz1.length + niz2.length];
			for (int i = 0; i < niz1.length+niz2.length; i += 2) {
				kombinovan[i] = niz1[i/2];
				kombinovan[i + 1] = niz2[i/2];
			}
		
		return kombinovan;
	}

	public static void main(String[] args) {
		int[]niz1= {1,2,3},niz2= {4,5,6},niz3= {9,8,7};
		
		for(int i=0;i<kombiniraj(niz1,niz2).length;i++) {
			System.out.print(kombiniraj(niz1,niz2)[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<kombiniraj(niz1,niz3).length;i++) {
			System.out.print(kombiniraj(niz1,niz3)[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<kombiniraj(niz3,niz1).length;i++) {
			System.out.print(kombiniraj(niz3,niz1)[i]+" ");
		}
	}

}
