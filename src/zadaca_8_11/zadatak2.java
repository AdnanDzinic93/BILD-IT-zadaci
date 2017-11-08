package zadaca_8_11;
import java.util.*;
public class zadatak2 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int korisnik = 1, negativni = 0, pozitivni = 0;
		double suma = 0;
		while (korisnik != 0) {
			System.out.println("Unesite novi broj, nula za prekid");
			korisnik = unos.nextInt();
			suma = suma + korisnik;
			if (korisnik < 0) {
				negativni++;
			} else if (korisnik > 0) {
				pozitivni++;
			}

		}
		System.out.println("Unijeli ste " + negativni + " negativnih brojeva i " + pozitivni + " pozitivna brojeva.");
		System.out.println("Suma svih unesenih brrojeva je " + suma + " a prosjek je " + suma / (negativni + pozitivni));
		
	}

}
