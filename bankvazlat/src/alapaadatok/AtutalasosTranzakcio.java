package alapaadatok;

public class AtutalasosTranzakcio extends SajatSzamlasTranzakcio {
	private String ellenszamlaSzama;

	public AtutalasosTranzakcio(Bankszamla sajatszamla, int osszeg, String ellenszamlaSzama) {
		super(sajatszamla, osszeg);
		this.ellenszamlaSzama = ellenszamlaSzama;
	}

	@Override
	public String toString() {
		return "AtutalasosTranzakcio [ellenszamlaSzama=" + ellenszamlaSzama + ", toString()=" + super.toString() + "]";
	}




}
