package Alistirma;

import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args) {
		// Kullanicidan Turkca,matematmik, fen:sosyal ve ingilizce ders notlari alin
		//tum derslerin not ortalamasini hesaplayin
		//ortalama 50den asagi ise kalsin degilse gecsin
		int turkce, matematik, fen, sosyal, ingilizce ;
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen Turkce notunu giriniz:");
		turkce=scan.nextInt();
		System.out.println("Lutfen Matematik notunu giriniz:");
		matematik=scan.nextInt();
		System.out.println("Lutfen Fen notunu giriniz:");
		fen=scan.nextInt();
		System.out.println("Lutfen Sosyal notunu giriniz:");
		sosyal=scan.nextInt();
		System.out.println("Lutfen Ingilizce notunu giriniz:");
		ingilizce=scan.nextInt();
		
		double ortalama= (turkce+matematik+fen+sosyal+ingilizce)/5;
		System.out.println("Basari oratalamaniz: "+ ortalama);
		if (ortalama<50) {
			System.out.println("sinifta kaldiniz!");
		} else {
			System.out.println("Sinifi basariyla gectiniz");
		}
	}

}
