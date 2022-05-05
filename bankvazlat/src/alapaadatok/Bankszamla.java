package alapaadatok;

public class Bankszamla {
	private Szemely tulajdonos;
	private int egyenleg;
	public Bankszamla(Szemely tulajdonos, int egyenleg) {
		super();
		this.tulajdonos = tulajdonos;
		this.egyenleg = egyenleg;
	}
	public int getEgyenleg() {
		return egyenleg;
	}
	public void setEgyenleg(int egyenleg) {
		this.egyenleg = egyenleg;
	}
	
	//...
	

}
