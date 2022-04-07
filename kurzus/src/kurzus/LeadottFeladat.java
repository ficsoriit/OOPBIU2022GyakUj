package kurzus;

import java.time.LocalDate;    

public class LeadottFeladat {
	private LocalDate datum;
	private int pontszam;
	
	public LeadottFeladat(LocalDate datum) {
		super();
		this.datum = datum;
		this.pontszam = -100;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}

	public int getPontszam() {
		return pontszam;
	}

	public void setPontszam(int pontszam) {
		this.pontszam = pontszam;
	}

	@Override
	public String toString() {
		return "LeadottFeladat [datum=" + datum + ", pontszam=" + pontszam + "]";
	}
	
	
}
