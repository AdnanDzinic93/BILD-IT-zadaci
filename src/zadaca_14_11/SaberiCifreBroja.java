package zadaca_14_11;

import java.util.*;
public class SaberiCifreBroja {
	public static int saberiCifre(long n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite broj");
		long broj=unos.nextLong();
		System.out.println("Zbir cifara ovog broja je " + saberiCifre(broj) );

	}

}
