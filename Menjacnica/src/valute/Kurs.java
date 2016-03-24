package valute;

import java.util.GregorianCalendar;

public class Kurs {

	private GregorianCalendar dan;
	private double kupovniKurs;
	private double prodajniKurs;
	private double srednjiKurs;

	public GregorianCalendar getDan() {
		return dan;
	}

	public void setDan(GregorianCalendar dan) {
		this.dan = dan;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}

}
