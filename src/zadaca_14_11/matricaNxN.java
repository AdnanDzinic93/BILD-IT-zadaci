package zadaca_14_11;

import java.util.Scanner;

public class matricaNxN {
	public static int nasumicanbroj(int n) {
		int broj = (int) (Math.random() * 2);
		return broj;
	}
	
	public static void printMatrix(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			System.out.print(nasumicanbroj(j)+" ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite broj");
		int n=unos.nextInt();
		printMatrix(n);
	}
}
