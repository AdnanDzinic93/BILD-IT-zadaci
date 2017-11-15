package zadaca_14_11;

public class NasumicnaSlovaIBrojevi {
	public static int nasumicanbroj(int i) {
		int broj = (int) (Math.random() * 1000);
		return broj;
	}

	public static char nasumicnoSlovo(int i) {
		char slovo = 'A';
		int broj = (int) (Math.random() * 25);
		while (broj != 0) {
			slovo++;
			broj--;
		}
		return slovo;
	}

	public static void main(String[] args) {
		int brojac = 0;
		for (int i = 1; i <= 100; i++) {
			brojac++;
			if (brojac % 10 != 0) {
				System.out.print(nasumicanbroj(i) + " " + nasumicnoSlovo(i) + " ");
			} else {
				System.out.println(nasumicanbroj(i) + " " + nasumicnoSlovo(i) + " ");
			}
		}
	}
}
