package kurzus;

public class Szemeszter {
	private Kurzus adatok;

	public Szemeszter(String kurzusID) {
		super();
		this.adatok = new Kurzus(kurzusID);
	}
	
	public void regisztral(int n) {
		for(int i = 0; i < n; i++) {
			adatok.getNévsor().add(new Diak("Diak" + i));
		}
	}
	
	
}
