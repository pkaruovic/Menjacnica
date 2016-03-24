package interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valute.Kurs;

public class Implementacija implements MenjacnicaInterfejs {
	
	private LinkedList<Kurs> kursevi;
	
	public Implementacija() {
		// TODO Auto-generated constructor stub
	}
	
	public Implementacija(LinkedList<Kurs> kursevi) {
		
		this.kursevi = kursevi;
	}

	@Override
	public void dodajKursValute(GregorianCalendar dan, double prodajniKurs, double kupovniKurs, double srednjiKurs) {
		
		Kurs kurs = new Kurs();
		
		kurs.setProdajniKurs(prodajniKurs);
		kurs.setKupovniKurs(kupovniKurs);
		kurs.setSrednjiKurs(srednjiKurs);
		kurs.setDan(dan);
		
		kursevi.add(kurs);

	}

	@Override
	public void izbrisiKursValute(GregorianCalendar dan) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs pronadjiKursValute(GregorianCalendar dan) {
		// TODO Auto-generated method stub
		return null;
	}

	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}

	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	
	

}
