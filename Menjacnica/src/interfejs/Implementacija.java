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
		Kurs k = new Kurs();
		
		k.setDan(dan);
		k.setKupovniKurs(kupovniKurs);
		k.setProdajniKurs(prodajniKurs);
		k.setSrednjiKurs(srednjiKurs);
		
		kursevi.add(k);

	}

	@Override
	public void izbrisiKursValute(GregorianCalendar dan) {
		
		for(int i=0; i<kursevi.size(); i++){
			if(kursevi.get(i).getDan().equals(dan)){
				kursevi.remove(i);
			}
		}

	}

	@Override
	public Kurs pronadjiKursValute(GregorianCalendar dan) {
		
		for(int i=0; i<kursevi.size(); i++){
			if(kursevi.get(i).getDan().equals(dan)){
				return kursevi.get(i);
			}
		}
		
		return null;
	}

	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}

	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}

	
}
