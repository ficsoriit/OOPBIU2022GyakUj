package kurzus;

import java.time.LocalDate;
import java.util.Random;

public class FelevLezaras {
	public static void main(String[] a) {

	
	Szemeszter szemeszter= new Szemeszter("kurzusID");
	szemeszter.regisztral(10);
	szemeszter.nevsorKiir();
	Random rd= new Random();
	for (int i = 0; i < 10; i++) {
		szemeszter.feladatotLead(i, 2021, 03, rd.nextInt(15)+16);
		szemeszter.ertekel(i, LocalDate.of(2021, 3, 21) );
		//2021. 03. 16 és 2021. 03.30
		
	}
	szemeszter.nevsorKiir();
	}

}
