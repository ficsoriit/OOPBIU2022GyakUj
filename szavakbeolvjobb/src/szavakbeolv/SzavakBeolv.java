package szavakbeolv;

import java.util.ArrayList;
import java.util.Scanner;

public class SzavakBeolv {
	private Scanner input;
	private ArrayList<String> szavak;
	
	/*
	public static void main(String[] args) {
		Scanner input = inputMegnyit();
		ArrayList<String> lista = szavak(input);
		tombKiir(lista);
		ArrayList<String> tomb = ismetlesek(lista);
		tombKiir(tomb);
	}
	*/
	public SzavakBeolv() {
		super();
		this.input = inputMegnyit();
	}
	
	
	public ArrayList<String> getSzavak() {
		return szavak;
	}

	


	@Override
	public String toString() {
		return "SzavakBeolv [szavak=" + szavak + "]";
	}


	private Scanner inputMegnyit() {
		return new Scanner(System.in);
	}


	private String kovetkezoSzo() {
		String sor = input.nextLine();
		if (sor.charAt(0) == '*')
			return "*";
		return sor;
	}

	public void szavak() {
		szavak = new ArrayList<String>();
		String szo;
		boolean logikaiBeszuras = false;
		while (!(szo = kovetkezoSzo()).equals("*")) {
			for (int i = 0; i < szavak.size(); i++) {
				if (szo.compareTo(szavak.get(i)) <= 0) {
					logikaiBeszuras = true;
					szavak.add(i, szo);
					break;
				}
			}
			if (!logikaiBeszuras) {
				szavak.add(szo);
			}
		}
	}


	public ArrayList<String> ismetlesek() {
		ArrayList<String> elofordul = new ArrayList<String>();
		String szo = "";
		int index = 0;
		for (int i = 0; i < szavak.size(); i++) {
			szo = szavak.get(i);
			for (int j = i + 1; j < szavak.size(); j++) {
				if (szavak.get(j).equals(szo)) {
					elofordul.add(szo);
					index = j;
					break;
				}
			}
			for (int k = index + 1; k < szavak.size(); k++) {
				if (szavak.get(k).equals(szo)) {
					i++;
				}
			}
		}
		return elofordul;
	}
}
