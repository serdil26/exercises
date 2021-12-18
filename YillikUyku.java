package Alistirma;

import java.util.Scanner;

public class YillikUyku {

	public static void main(String[] args) {
		//Kullanicidan aldigimiz "gunluk kac saat uyuyorsun" bilgisiyle haftalik, aylik ve yillik uyku saatini hesaplayalim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Gunluk kac saat uyuyorsunuz?");
		double uyku= scan.nextDouble();
		
		double haftalik= 7*uyku/24;
		double aylik= 30*uyku/24;
		double yillik= 365*uyku/24;
		
		System.out.println("Haftada " + haftalik +" gununuz uykuda geciyor " + "Ayda " + aylik + " gununuz uykuda geciyor" 
		+" Yilda "+ yillik + " gununuz uykuda geciyor. Iyi uykular");

	}

}
