package If_Else;

import java.util.Scanner;

public class DortIslem {

	public static void main(String[] args) {
		// Kullanicidan yapmak istedigi 4 islemden birini ve 2 adet sayi girmesini isteyin
		//sectigi islemi if kullanarak yapin

		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen yapmak istedigini islemi secin");
		String islem= scan.next();
		
		System.out.println("Lutfen bir sayi giriniz");
		int sayi1=scan.nextInt();
		System.out.println("lutfen yeni bir sayi giriniz");
		int sayi2=scan.nextInt();
		
		if (islem.equals("+")) {
			System.out.println("toplama sonucu :" + (sayi1+sayi2));
		}
		if (islem.equals("-")) {
			System.out.println("cikarma sonucu :" + (sayi1-sayi2));
	}
		if (islem.equals("*")) {
			System.out.println("carpma sonucu :" + (sayi1*sayi2));
		}
		if (islem.equals("/")) {
			System.out.println("bolme sonucu :" + (sayi1/sayi2));
}
	}
}
