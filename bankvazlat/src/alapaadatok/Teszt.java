package alapaadatok;

import java.util.ArrayList;
import java.util.List;

public class Teszt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Szemely ugyfel = new Szemely("Kiss Pista");
		Bankszamla szamla1 = new Bankszamla(ugyfel, 0);
		Tranzakcio befizetes = new SajatSzamlasTranzakcio(szamla1, 10000);
		System.out.println(szamla1.getEgyenleg());
		List<Tranzakcio> tranzakciok = new ArrayList<Tranzakcio>();
		tranzakciok.add(befizetes);
		Tranzakcio atutalas = new AtutalasosTranzakcio(szamla1, 20000, "11111111-22222222");
		tranzakciok.add(atutalas);
		listaz(tranzakciok);
		
	}

	public static void listaz (List<Tranzakcio> tomb) {
		for (Tranzakcio elem : tomb) {
			System.out.println(elem);
		}
	}
}
