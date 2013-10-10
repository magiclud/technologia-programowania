package lista1;

import junit.framework.TestCase;



	public class LiczbaTestJUnit3 extends TestCase {

		private int liczbaDoKonwersji;
		private Liczba liczba;

		@Override
		protected void setUp() throws Exception {
			super.setUp();
			this.liczbaDoKonwersji = 16;
			liczba = new Liczba(liczbaDoKonwersji);
		}

		@Override
		protected void tearDown() throws Exception {
			super.tearDown();
			liczba = null;
		}

		public final void testLiczba() {
			assertNotNull(liczba);
		}

		public final void testPoprawnoscUtowrzenieObiektuLiczbyDlaPrawidlowegoParametru() throws LiczbaException {
			int proprawnaLiczbaDoKonwersji = 123;
			liczba = new Liczba(proprawnaLiczbaDoKonwersji);
			assertNotNull(liczba);
		}

		public final void testPoprawnoscWyjatkuJesliTworzonyJestObiektDlaDlaNieprawidlowegoParametru() throws LiczbaException {
			int nieproprawnaLiczbaDoKonwersji = -1;
			try {
				liczba = new Liczba(nieproprawnaLiczbaDoKonwersji);
			} catch (Exception e) {

				if (!(e instanceof LiczbaException)) {
					fail("Konstruktor rzucił nieoczekiwany wyjatek");
				}
				assertEquals(e.getMessage(), "Nieprawidlowa liczba");
			}
		}

		public final void testPoprawnoscWyjatkuJesliPodanyJestNieprawidlowySystem() throws LiczbaException {
			int nieprawidlowySystem = -1;
			try {
				liczba.konwersjaNaInnySystem(nieprawidlowySystem);
			} catch (Exception e) {

				if (!(e instanceof LiczbaException)) {
					fail("Konstruktor rzucił nieoczekiwany wyjatek");
				}
				assertEquals(e.getMessage(), "Nieprawidlowy system");
			}
		}

		public final void testKonwersja0NaSzstemBinarny() throws LiczbaException {
			Liczba liczbaZerowa = new Liczba(0);
			int system = 2;
			String wynikKonwersji = liczbaZerowa.konwersjaNaInnySystem(system);
			assertEquals("0", wynikKonwersji);
		}

		public final void testKonwersjaNaSzstemBinarny() throws LiczbaException {
			int system = 2;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
			assertTrue(wynikKonwersji.equals("10000"));
		}

		public final void testKonwersjaNaSzstemTrójkowy() throws LiczbaException {
			int system = 3;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
			assertEquals("121", wynikKonwersji);
		}

		public final void testKonwersjaNaSzstemCzworkowy() throws LiczbaException {
			int system = 4;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);// odp.100
			assertFalse(wynikKonwersji.equals("24"));
		}

		public final void testKonwersjaNaSzstemPiatkowy() throws LiczbaException {
			int system = 5;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
			assertEquals("31", wynikKonwersji);
		}

		public final void testKonwersjiNaSystemSzostkowy() throws LiczbaException {
			int system = 6;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);// odp.24
			assertFalse(wynikKonwersji.equals("23"));
		}

		public final void testKonwersjaNaSzstemSiodemkowy() throws LiczbaException {
			int system = 7;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
			assertTrue(wynikKonwersji.equals("22"));
		}

		public final void testKonwersjaNaSzstemOsemkowy() throws LiczbaException {
			int system = 8;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
			assertTrue(wynikKonwersji.equals("20"));
		}

		public final void testKonwersjaNaSzstemDziewiatkowy() throws LiczbaException {
			int system = 9;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
			assertEquals("17", wynikKonwersji);
		}

		public final void testKonwersjaNaSzstemDziesiatkowy() throws LiczbaException {
			int system = 10;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
			assertTrue(wynikKonwersji.equals("16"));
		}

		public final void testKonwersjaNaSzstemJedenastkowy() throws LiczbaException {
			int system = 11;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
			assertTrue(wynikKonwersji.equals("15"));
		}

		public final void testKonwersjaNaSzstemDwunastkowy() throws LiczbaException {
			int system = 12;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
			assertEquals("14", wynikKonwersji);
		}

		public final void testKonwersjaNaSzstemTrzynastkowy() throws LiczbaException {
			int system = 13;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);// odp. 13
			assertFalse(wynikKonwersji.equals("10"));
		}

		public final void testKonwersjaNaSzstemCznernastkowy() throws LiczbaException {
			int system = 14;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);// odp. 12
			assertFalse(wynikKonwersji.equals("10"));
		}

		public final void testKonwersjaNaSzstemPietnastkowy() throws LiczbaException {
			int system = 15;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
			assertEquals("11", wynikKonwersji);
		}

		public final void testKonwersjaNaSzstemSzesnastkowy() throws LiczbaException {
			int system = 16;
			String wynikKonwersji = liczba.konwersjaNaInnySystem(system);
			assertEquals("10", wynikKonwersji);
		}

	}


