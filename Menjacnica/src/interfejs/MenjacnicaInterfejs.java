package interfejs;

import java.util.GregorianCalendar;

import valute.Kurs;

public interface MenjacnicaInterfejs {

	public void dodajKursValute(GregorianCalendar dan, double prodajniKurs, double kupovniKurs, double srednjiKurs);
	
	public void izbrisiKursValute(GregorianCalendar dan);
	
	public Kurs pronadjiKursValute(GregorianCalendar dan);
}
