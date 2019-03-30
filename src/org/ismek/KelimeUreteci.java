package org.ismek;

import java.util.Random;

public class KelimeUreteci {

	static String ogrenciAdiUret(byte harfSayisi) {
		char[] harfDizisi = new char[26];

		byte index = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			harfDizisi[index] = i;
			index++;
		}
		
		String kelime = "";
		for (int j = 0; j < harfSayisi; j++) {
			Random random = new Random();
			int harfDizisiIndexi = random.nextInt(26);
			char harf = harfDizisi[harfDizisiIndexi];
			kelime += harf;
		}
		
		return kelime;
	}
}
