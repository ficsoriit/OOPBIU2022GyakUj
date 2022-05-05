package alapaadatok;

public class SajatSzamlasTranzakcio implements Tranzakcio {
	private Bankszamla sajatszamla;
	private int osszeg;
	
	// ....
	public SajatSzamlasTranzakcio(Bankszamla sajatszamla, int osszeg) {
		super();
		this.sajatszamla = sajatszamla;
		this.osszeg = osszeg;
		setBalance(osszeg);
		
	}

	
	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		sajatszamla.getEgyenleg();
		return 0;
	}



	@Override
	public void setBalance(int amount) {
		// TODO Auto-generated method stub
		sajatszamla.setEgyenleg(sajatszamla.getEgyenleg() + amount);
	}


	@Override
	public String toString() {
		return "SajatSzamlasTranzakcio [sajatszamla=" + sajatszamla + ", osszeg=" + osszeg + "]";
	}

	
}
