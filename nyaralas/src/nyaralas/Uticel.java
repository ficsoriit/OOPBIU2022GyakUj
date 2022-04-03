package nyaralas;

import java.time.LocalDate;

public class Uticel {
	private String uticel;
	private int tavolsag;
	private LocalDate indulas;
	
	public Uticel(String uticel, int tavolsag, LocalDate indulas) {
		super();
		this.uticel = uticel;
		this.tavolsag = tavolsag;
		this.indulas = indulas;
	}
	public Uticel(String uticel) {
		this(uticel,100, LocalDate.now());
	}
	public String getUticel() {
		return uticel;
	}
	public void setUticel(String uticel) {
		this.uticel = uticel;
	}
	public int getTavolsag() {
		return tavolsag;
	}
	public void setTavolsag(int tavolsag) {
		this.tavolsag = tavolsag;
	}
	public LocalDate getIndulas() {
		return indulas;
	}
	public void setIndulas(LocalDate indulas) {
		this.indulas = indulas;
	}
	@Override
	public String toString() {
		return "Uticel [uticel=" + uticel + ", tavolsag=" + tavolsag + ", indulas=" + indulas + "]";
	}
	
}
