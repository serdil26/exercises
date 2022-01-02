package loops;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// pin kodunu kontrol eden ve 3 giris hakki veren bir kod yaziniz

		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen pininizi giriniz");
		int pinKul=scan.nextInt();
		int pin=2626;
		int sayac= 3;
		
		while(true) {
			System.out.println("pin kodunuzu giriniz");
			pin=scan.nextInt();
			if (pinKul==pin) {
				System.out.println("basarili giris");
				break;
			} else {
				System.out.println("hatali giris yaptiniz");
				sayac--;
				System.out.println("kalan hakkiniz ;" + sayac);
				if (sayac==0) {
					System.out.println("pininiz bloke edildi");
					break;
				}
			}
		}
		
	}

}
