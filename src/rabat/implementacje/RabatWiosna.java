package rabat.implementacje;

import rabat.Rabat;

public class RabatWiosna implements Rabat {
	
	double rabat = 0.15;
	double cena;

	@Override
	public double naliczRabat(double cena) {
		this.cena = cena;
		rabat = rabat * cena; 
		cena = cena - rabat;
		return cena;
	}
	
	public String toString() {
		return "Rabat 15%";
	}

}