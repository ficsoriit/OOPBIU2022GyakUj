package kurzus;

import java.util.ArrayList;

public class Kurzus {
	private String kurzusID;
	private static int legnagyobbID;
	private ArrayList<Diak> n�vsor = new ArrayList<Diak>();
	
	public Kurzus(String kurzusID) {
		super();
		this.kurzusID = kurzusID;
		this.legnagyobbID = 100;
	}

	@Override
	public String toString() {
		return "Kurzus [kurzusID=" + kurzusID + ", n�vsor=" + n�vsor + "]";
	}

	public ArrayList<Diak> getN�vsor() {
		return n�vsor;
	}
	
}
