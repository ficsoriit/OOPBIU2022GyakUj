package szavakbeolv;

import java.util.ArrayList;
import java.util.Scanner;

// Funkcionális szemlélet
// Mintha C program lenne, de Java szintaktikával.
// Késõbb átalakítjuk

public class SzavakBeolv {
	public static void main(String[] args) {
		Scanner input = inputMegnyit();
		ArrayList<String> lista = szavak(input);
		tombKiir(lista);
		ArrayList<String> tomb= ismetlesek(lista);
		tombKiir(tomb);
	}
	static Scanner inputMegnyit() {
		return new Scanner(System.in);
	}
	static String kovetkezoSzo(Scanner input) {
		String sor = input.nextLine();
		if(sor.charAt(0) == '*')
			return "*";
		return sor;
	}
	static ArrayList<String> szavak(Scanner input) {
		ArrayList<String> szavak = new ArrayList<String>();
		String szo;
		boolean logikaiBeszuras= false;
		while(!(szo = kovetkezoSzo(input)).equals("*")) {
			for (int i = 0; i < szavak.size(); i++) {
				if(szo.compareTo(szavak.get(i)) <= 0) {
					logikaiBeszuras=true;
					szavak.add(i, szo);
					break;
				}
			}
			if (!logikaiBeszuras) {
				szavak.add(szo);
			}
		}
		return szavak;
	}
	static void tombKiir(ArrayList<String> tomb) {
		System.out.println("A tomb elemei: ");
		for (int i = 0; i < tomb.size(); i++) {
			System.out.println(tomb.get(i));
		}
		System.out.println();
	}
	static ArrayList<String> ismetlesek(ArrayList<String> tomb){
		ArrayList<String>elofordul= new ArrayList<String>();
		String szo="";
		int index=0;
		for (int i = 0; i < tomb.size(); i++) {
			szo=tomb.get(i);
			for (int j = i+1; j < tomb.size(); j++) {
				if (tomb.get(j).equals(szo)) {
					elofordul.add(szo);
					index=j;
					break;
				}
			}
			for (int k = index+1; k < tomb.size(); k++) {
				if (tomb.get(k).equals(szo)) {
					i++;
				}
			}
		}
		return elofordul;
	}
}
