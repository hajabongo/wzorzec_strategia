package rabat.implementacje;

import rabat.Rabat;

public class BrakRabatu implements Rabat {

	@Override
	public double naliczRabat(double cena) {
		//
		return cena;
	}
	
	public String toString() {
		return "Brak rabatu";
	}

}
