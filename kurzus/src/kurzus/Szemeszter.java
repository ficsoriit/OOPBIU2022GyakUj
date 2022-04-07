package kurzus;

import java.time.LocalDate;
import java.util.Random;

public class Szemeszter {
	private Kurzus adatok;

	public Szemeszter(String kurzusID) {
		super();
		this.adatok = new Kurzus(kurzusID);
	}
	
	public void regisztral(int n) {
		for(int i = 0; i < n; i++) {
			adatok.getNevsor().add(new Diak("Diak" + (i+1)));
		}
	}
	
	public void nevsorKiir() {
		System.out.println("Nevsor:");
		for(Diak item : adatok.getNevsor()) {
			System.out.println(item);
		}
	}
	public void feladatotLead(int diakIndex,int year,int month,int day) {
		adatok.getNevsor().get(diakIndex).setFeladat(new LeadottFeladat(LocalDate.of( year,  month,  day)));
	}
	public void ertekel(int diakIndex,LocalDate feladatHatarido) {
		int pontszam=0;
		Random rd=new Random();
		LocalDate leadasiDatum;
		LeadottFeladat feladat = adatok.getNevsor().get(diakIndex).getFeladat();
		leadasiDatum = feladat.getDatum();
		
		if (leadasiDatum.isAfter(feladatHatarido)) {
			pontszam=-1;
		}
		else {
			pontszam = rd.nextInt(6);
		}
		feladat.setPontszam(pontszam);
	}
	
	
}
