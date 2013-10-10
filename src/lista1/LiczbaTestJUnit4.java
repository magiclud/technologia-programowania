package lista1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class LiczbaTestJUnit4 {

	private int liczbaDoKonwersji;
	Liczba liczba;

	@Before
	public void setUp() throws Exception {
		this.liczbaDoKonwersji = 16;
		liczba = new Liczba(liczbaDoKonwersji);
	}

	@After
	public void tearDown() throws Exception {
		liczba = null;
	}

	@Test(expected = LiczbaException.class)
	public final void testPoprawnoscWyjatkuJesliTworzonyJestObiektDlaDlaNieprawidlowegoParametru() throws LiczbaException {
		int nieprawidłowaLiczba = -1;
		liczba = new Liczba(nieprawidłowaLiczba);
	}

	@Test
	public final void testPoprawnoscUtowrzenieObiektuLiczbyDlaPrawidlowegoParametru() throws LiczbaException {
		int proprawnaLiczbaDoKonwersji = 123;
		liczba = new Liczba(proprawnaLiczbaDoKonwersji);
		assertNotNull(liczba);
	}

	@Test(expected = LiczbaException.class)
	public final void testPoprawnoscWyjatkuJesliPodanyJestNieprawidlowySystem() throws LiczbaException {
		int nieprawidlowySystem = -1;
		liczba.konwersjaNaInnySystem(nieprawidlowySystem);
	}

	@Ignore
	public final void testKonwersjaNaSzstemBinarny() throws LiczbaException {
		int system = 2;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertTrue(wynikKonwersji.equals("10000"));
	}


	@Test(timeout = 999)
	public final void testKonwersjaNaSzstemTrójkowyDlaBardzoDuzejLiczby() throws LiczbaException {
		liczba = new Liczba(Integer.MAX_VALUE);
		int system = 2;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertEquals("1111111111111111111111111111111", wynikKonwersji);
	}

	@Ignore
	public final void testKonwersjaNaSzstemCzworkowy() throws LiczbaException {
		int system = 4;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);// odp.100
		assertFalse(wynikKonwersji.equals("24"));
	}

	@Test
	public final void testKonwersjaNaSzstemPiatkowy() throws LiczbaException {
		int system = 5;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertEquals("31", wynikKonwersji);
	}

	@Test
	public final void testKonwersjiNaSystemSzostkowy() throws LiczbaException {
		int system = 6;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);// odp.24
		assertFalse(wynikKonwersji.equals("23"));
	}

	@Test
	public final void testKonwersjaNaSzstemSiodemkowy() throws LiczbaException {
		int system = 7;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertTrue(wynikKonwersji.equals("22"));
	}

	@Test
	public final void testKonwersjaNaSzstemOsemkowy() throws LiczbaException {
		int system = 8;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertTrue(wynikKonwersji.equals("20"));
	}

	@Test
	public final void testKonwersjaNaSzstemDziewiatkowy() throws LiczbaException {
		int system = 9;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertEquals("17", wynikKonwersji);
	}

	@Test
	public final void testKonwersjaNaSzstemDziesiatkowy() throws LiczbaException {
		int system = 10;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertTrue(wynikKonwersji.equals("16"));
	}

	@Test
	public final void testKonwersjaNaSzstemJedenastkowy() throws LiczbaException {
		int system = 11;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertTrue(wynikKonwersji.equals("15"));
	}

	@Test
	public final void testKonwersjaNaSzstemDwunastkowy() throws LiczbaException {
		int system = 12;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertEquals("14", wynikKonwersji);
	}

	@Test
	public final void testKonwersjaNaSzstemTrzynastkowy() throws LiczbaException {
		int system = 13;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertFalse(wynikKonwersji.equals("10"));
	}

	@Test
	public final void testKonwersjaNaSzstemCznernastkowy() throws LiczbaException {
		int system = 14;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);// odp.12
		assertFalse(wynikKonwersji.equals("10"));
	}

	@Test
	public final void testKonwersjaNaSzstemPietnastkowy() throws LiczbaException {
		int system = 15;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertEquals("11", wynikKonwersji);
	}

	@Test
	public final void testKonwersjaNaSzstemSzesnastkowy() throws LiczbaException {
		int system = 16;
		String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
		assertEquals("10", wynikKonwersji);
	}


}

