package kurzus;

import java.util.ArrayList;

public class Kurzus {
	private String kurzusID;
	private static int legnagyobbID;
	private ArrayList<Diak> névsor = new ArrayList<Diak>();
	
	public Kurzus(String kurzusID) {
		super();
		this.kurzusID = kurzusID;
		this.legnagyobbID = 100;
	}

	@Override
	public String toString() {
		return "Kurzus [kurzusID=" + kurzusID + ", névsor=" + névsor + "]";
	}

	public ArrayList<Diak> getNévsor() {
		return névsor;
	}
	
}
