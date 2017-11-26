package Bonus_zadaci_za_vjezbu_25_11;

import java.util.Scanner;

public class piramida {
	public static void piramida(int krajnji, int pocetni) {
		for(int i=pocetni;i<=krajnji;i++) {
			for(int j=1;j<=krajnji-i;j++) {
				System.out.print("  ");
			}
			for(int j=pocetni;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int k=i-1;k>=pocetni;k--) {
				System.out.print(k+" ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unsite krajnji i pocetni broj u piramidi");
		int krajnji=unos.nextInt(),pocetni=unos.nextInt();
		piramida(krajnji,pocetni);
	}

}
