package org.ismek;

public class Yazdirici {

	static void fatihBilisimOkuluYazdir() {
		programBasligiYazdir("Fatih Bilişim Okulu");
	}

	static void programBasligiYazdir(String parametre) {
		System.out.println("-----------**************-------------");
		System.out.println("***********" + parametre + "***********");
		ayracYazdir();
	}

	static void ayracYazdir() {
		System.out.println("");
		System.out.println("*****************************");
		System.out.println("");
	}

	static void islemSonucuYazdir(String baslik, String deger) {
		System.out.println("");
		System.out.println("*****" + baslik + "=" + deger + "***************");
		System.out.println("");
	}
	
	static void islemSonucuYazdir(String baslik, int deger) {
		System.out.println("*****" + baslik + "=" + deger + "***************");
	}
}
