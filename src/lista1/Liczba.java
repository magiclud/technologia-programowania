package lista1;

public class Liczba {


	private int liczba;

	private static String tablicaHex[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

	public Liczba(int liczba) throws LiczbaException {
		this.liczba = liczba;
		poprawnoscLiczby(liczba);
	}

	public void poprawnoscLiczby(int liczba) throws LiczbaException {
		if (liczba < 0) {
			throw new LiczbaException("Nieprawidlowa liczba");
		}
	}

	public String konwersjaNaInnySystem(int podstawa) throws LiczbaException {

		sprawdzPodstawe(podstawa);

		String liczbaHex = "";
		int dana = liczba;
		if (dana == 0) {
			return "0";
		}
		while (dana > 0) {
			liczbaHex = tablicaHex[dana % podstawa] + liczbaHex;
			dana = dana / podstawa;
		}
		return liczbaHex;
	}

	private void sprawdzPodstawe(int podstawa) throws LiczbaException {
		if (podstawa < 2 || podstawa > 16) {
			throw new LiczbaException("Nieprawidlowy system");
		}

	}


}
