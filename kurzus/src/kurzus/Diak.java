package kurzus;


public class Diak {
	private int ID;
	private String nev;
	private LeadottFeladat feladat;
	
	public Diak(String nev) {
		super();
		this.nev = nev;
		ID = Kurzus.getLegnagyobbID();
		Kurzus.setLegnagyobbID(ID+1);
		
	}

	@Override
	public String toString() {
		return "Diak [ID=" + ID + ", nev=" + nev + ", feladat=" + feladat + "]";
	}

	// GETTER, SETTER
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getnev() {
		return nev;
	}

	public LeadottFeladat getFeladat() {
		return feladat;
	}

	public void setFeladat(LeadottFeladat feladat) {
		this.feladat = feladat;
	}
	
	
	
}
