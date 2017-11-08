package zadaca_8_11;

import java.util.*;

public class zadatak1 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite mjesecni iznos stednje i broj mjeseci koji zelite da stedite");
		double mjesecnaStednja = unos.nextDouble(), brojMjeseci = unos.nextDouble(), ustedeno = 0;
		for (int i = 1; i <= brojMjeseci; i++) {
			ustedeno = (ustedeno + mjesecnaStednja) * 1.00417;
		}
		System.out.println("Ustedili bi ste" + ustedeno);

	}

}
