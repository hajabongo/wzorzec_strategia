package wycieczka;

import rabat.Rabat;
import rabat.implementacje.BrakRabatu;
import rabat.implementacje.RabatJesien;
import rabat.implementacje.RabatWiosna;
import rabat.implementacje.RabatZima;

public class Wycieczka {
	
	private Rabat rabat;
	private double cena;
	int miesiac;
	
	//
	public Wycieczka() {
		rabat = new BrakRabatu();
	}
	
	public Wycieczka(int miesiac, double cena) {
		this.cena = cena;
		this.miesiac  = miesiac;
		
		//algorytm przyznania rabatu
		wybierzRabat(miesiac);
		setCena(rabat.naliczRabat(cena));
	}
	
	//
	
	public void wybierzRabat(int miesiac) {
		if (cena > 500) {
			if (miesiac==11 || miesiac==12 || miesiac==1 || miesiac==2) {
				setRabat(new RabatZima());
			}
			else if (miesiac==3 || miesiac==4 || miesiac==5) {
				setRabat(new RabatWiosna());
			}
			else if (miesiac==9 || miesiac==10) {
				setRabat(new RabatJesien());
			}
			else setRabat(new BrakRabatu());
		}
		else setRabat(new BrakRabatu());
		
	}
	
	//get & set

	public Rabat getRabat() {
		return rabat;
	}

	public void setRabat(Rabat rabat) {
		this.rabat = rabat;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	

}
