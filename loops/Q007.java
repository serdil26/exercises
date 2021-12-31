package loops;

import java.util.Scanner;

public class Q007 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
	    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
	            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

	    Sesli harfler: a,e,i,o,u
      Test Data: a

	    Beklenen Çıktı:  a harfi sesli harfdir.

	    Test Data:  d

	    Beklenen Çıktı:  d harfi sesiz harftir.

	    Test Data: we  yada %

	    Beklenen Çıktı:  Yanlis karakter girdiniz!

	     */
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen bir harf giriniz");
		String harf= scan.next();
		String sesliHarfler= "aeiou";
		String sessizHarfler = "bcdfghjklmnprstvyzxwq";
		
		if (harf.length()==1) {
			
		
		for (int i = 0; i < sessizHarfler.length(); i++) {
			if (sesliHarfler.contains(harf)) {
				System.out.println("girilen harf seslidir");
				break;
			} else if (sessizHarfler.contains(harf)) {
				System.out.println("girilen harf sessizdir");
				break;
			} else
				System.out.println("yanlis karakter girdiniz");
			break;
		}
		} else
			System.out.println("tek bir karakter giriniz");
		
	}
}
