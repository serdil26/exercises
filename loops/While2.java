package loops;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yaziniz.

		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen pininizi giriniz");
		int pinKul=scan.nextInt();
		int pin=2626;
		
		while (pinKul!=pin) {
			System.out.println("yanlis pin girdiniz");
			System.out.println("tekrar deneyiniz");
			pinKul=scan.nextInt();
		}
		System.out.println("basarili giris");
		
	}

}
