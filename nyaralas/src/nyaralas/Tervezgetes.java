package nyaralas;

public class Tervezgetes {
	private Uticel uticelArr[] = new Utiterv().getUticelArr();
	
	public void lista() {
		for(int i = 0; i < uticelArr.length; i++) {
			System.out.println(uticelArr[i]);
		}
	}
	public Uticel legtavolabbUticel() {
		int index = 0;
		for(int i = 0; i < uticelArr.length; i++) {
			if(uticelArr[index].getTavolsag() < uticelArr[i].getTavolsag()) {
				index = i;
			}
		}
		return uticelArr[index];
	}
}
