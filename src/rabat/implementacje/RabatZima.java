package rabat.implementacje;

import rabat.Rabat;

public class RabatZima implements Rabat {
	
	double rabat = 0.25;
	double cena;

	@Override
	public double naliczRabat(double cena) {
		this.cena = cena;
		rabat = rabat * cena; 
		cena = cena - rabat;
		return cena;
	}

	public String toString() {
		return "Rabat 25%";
	}
}
