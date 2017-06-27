package rabat.implementacje;

import rabat.Rabat;

public class RabatJesien implements Rabat {
	
	double rabat = 0.1;
	double rabat2 = 100.0;
	double cena;

	@Override
	public double naliczRabat(double cena) {
		this.cena = cena;
		if (cena < 1000) return cena-rabat2;
		else rabat = rabat * cena; 
		cena = cena - rabat;
		return cena;
	}

	public String toString() {
		if(cena<1000) return "Rabat 100 z³";
		else return "Rabat 10%";
	}
}
