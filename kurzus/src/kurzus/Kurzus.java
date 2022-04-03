package kurzus;

import java.util.ArrayList;

public class Kurzus {
	private String kurzusID;
	private static int legnagyobbID;
	private ArrayList<Diak> nevsor = new ArrayList<Diak>();
	
	public Kurzus(String kurzusID) {
		super();
		this.kurzusID = kurzusID;
		this.legnagyobbID = 100;
	}

	@Override
	public String toString() {
		return "Kurzus [kurzusID=" + kurzusID + ", nevsor=" + nevsor + "]";
	}

	
	public static int getLegnagyobbID() {
		return legnagyobbID;
	}

	public static void setLegnagyobbID(int legnagyobbID) {
		Kurzus.legnagyobbID = legnagyobbID;
	}

	public ArrayList<Diak> getNevsor() {
		return nevsor;
	}
	
}
