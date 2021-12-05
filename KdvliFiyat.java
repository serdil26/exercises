package Alistirma;

import java.util.Scanner;

public class KdvliFiyat {

	public static void main(String[] args) {
		double tutar , kdvliFiyat, kdv=0.18;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("urunun tutarini giriniz");
tutar=scan.nextDouble();
kdvliFiyat= tutar +tutar*kdv;
System.out.println("Urunun KDV'li fiyati: " + kdvliFiyat + "TL");
	}

}
