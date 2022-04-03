package nyaralas;

import java.time.LocalDate;

public class Utiterv {
	private Uticel UticelArr[] = new Uticel[4];
	public Utiterv() {
		UticelArr[0] = new Uticel("Berlin", 600, LocalDate.of(2019, 6, 22));
		UticelArr[1] = new Uticel("London", 1200, LocalDate.of(2019, 5, 5));
		UticelArr[2] = new Uticel("Siofok", 300, LocalDate.of(2019, 8, 8));
		UticelArr[3] = new Uticel("Kassa");
	}
	public Uticel[] getUticelArr() {
		return UticelArr;
	}
}

