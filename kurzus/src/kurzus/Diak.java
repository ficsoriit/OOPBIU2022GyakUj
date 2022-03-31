package kurzus;


public class Diak {
	private int ID;
	private String név;
	private LeadottFeladat feladat;
	
	public Diak(String név) {
		super();
		this.név = név;
	}

	@Override
	public String toString() {
		return "Diak [ID=" + ID + ", név=" + név + ", feladat=" + feladat + "]";
	}

	// GETTER, SETTER
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNév() {
		return név;
	}

	public LeadottFeladat getFeladat() {
		return feladat;
	}

	public void setFeladat(LeadottFeladat feladat) {
		this.feladat = feladat;
	}
	
	
	
}
