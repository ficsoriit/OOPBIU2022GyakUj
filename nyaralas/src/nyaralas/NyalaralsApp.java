package nyaralas;

public class NyalaralsApp {

	public static void main(String[] args) {
		Tervezgetes firstPeldany = new Tervezgetes();
		firstPeldany.lista();
		System.out.println();
		System.out.println("A legtávolabbi uticél: ");
		System.out.println(firstPeldany.legtavolabbUticel());		
	}

}
