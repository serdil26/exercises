package day07_IfStatements;

import java.util.Scanner;

public class C05_BasitIfCumleleri {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
		//gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
		//ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
		
		Scanner scan= new Scanner (System.in);
		System.out.println("lutfen bir gun ismi giriniz");
		String gun=scan.next();
		
		if (gun.equals("cuma")); {
			System.out.println("Muslumanlar icin kutsal gun");
		}
		if (gun.equals("cumartesi"));{
			System.out.println("Yahudiler icin kutsal gun");
		}
		if (gun.equals("pazar"));{
			System.out.println("Hristiyanlar icin kutsal gun");
		}
	}

}
