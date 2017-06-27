package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import rabat.implementacje.RabatZima;
import wycieczka.Wycieczka;

public class Test {

	public static void main(String[] args) {
		
//		System.out.println("Podaj miesi¹c wycieczki (format liczbowy): ");
//		Integer miesiac;
//		do {
//			try {
//				miesiac = new Scanner(System.in).nextInt();
//			} catch (InputMismatchException e) {
//				System.out.println("Niew³aœciwy format, wpisz ponownie");
//				miesiac = null;
//			}
//		} while (miesiac == null || miesiac > 12 || miesiac < 1);
//		
//		System.out.println("Podaj cenê wycieczki:");
//		double cena = new Scanner(System.in).nextDouble();
//		
//		Wycieczka wycieczka = new Wycieczka(miesiac, cena);
//		System.out.println("Cena wycieczki wynosi: " + wycieczka.getCena() + " - " + wycieczka.getRabat().toString());
//	
		
		for (int i=1 ; i<13 ; ++i) {
			Wycieczka wycieczka = new Wycieczka(i, 15000);
			System.out.println(i + " " + wycieczka.getCena() + " " + wycieczka.getRabat().toString());
		}
		
		Wycieczka a = new Wycieczka(10, 2600);
		System.out.println(a.getCena() + " naliczony " + a.getRabat().toString());
	}
}
