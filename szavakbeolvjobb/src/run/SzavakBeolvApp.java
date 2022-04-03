package run;

import szavakbeolv.SzavakBeolv;
import util.Segedmetodusok;

public class SzavakBeolvApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SzavakBeolv beolvaso = new SzavakBeolv();
		beolvaso.szavak();
		//Teszt
		//System.out.println(beolvaso);
		Segedmetodusok.tombKiir(beolvaso.getSzavak());
		Segedmetodusok.tombKiir(beolvaso.ismetlesek());
	}

}

