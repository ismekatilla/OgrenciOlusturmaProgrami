package org.ismek;

public class Ogrenci {

	int numara;
	String adi;
	
	@Override
	public String toString() {
		return "Öğrenci Adı = " + adi + " Öğrenci Numarası = " + numara;
	}
}