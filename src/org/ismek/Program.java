package org.ismek;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		Yazdirici.fatihBilisimOkuluYazdir();
		Ogrenci[] ogrenciDizisi = new Ogrenci[10];
		
		Random rnd = new Random();
		for (int i = 0; i < ogrenciDizisi.length; i++) {
			byte kelimedekiHarfSayisi = (byte) rnd.nextInt(10);
			int ogrenciNumarasi = rnd.nextInt(100);
			String ogrenciAdi = KelimeUreteci.ogrenciAdiUret(kelimedekiHarfSayisi);
			
			Ogrenci ogrenci = new Ogrenci();
			ogrenci.adi = ogrenciAdi;
			ogrenci.numara = ogrenciNumarasi;
			ogrenciDizisi[i] = ogrenci;
		}
		
//		for (Ogrenci ogrenci : ogrenciDizisi) {
//			Yazdirici.islemSonucuYazdir("Öğrenci Adı", ogrenci.adi);
//			Yazdirici.islemSonucuYazdir("Öğrenci Numarası", ogrenci.numara);
//			Yazdirici.ayracYazdir();
//		}
		
		for (Ogrenci ogrenci : ogrenciDizisi) {
			System.out.println(ogrenci.toString());
		}
	}
}