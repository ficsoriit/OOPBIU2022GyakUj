package kurzus;

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
}
