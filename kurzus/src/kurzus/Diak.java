package kurzus;


public class Diak {
	private int ID;
	private String n�v;
	private LeadottFeladat feladat;
	
	public Diak(String n�v) {
		super();
		this.n�v = n�v;
	}

	@Override
	public String toString() {
		return "Diak [ID=" + ID + ", n�v=" + n�v + ", feladat=" + feladat + "]";
	}

	// GETTER, SETTER
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getN�v() {
		return n�v;
	}

	public LeadottFeladat getFeladat() {
		return feladat;
	}

	public void setFeladat(LeadottFeladat feladat) {
		this.feladat = feladat;
	}
	
	
	
}
