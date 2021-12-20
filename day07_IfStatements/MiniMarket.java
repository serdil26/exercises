package If_Else;

import java.util.Scanner;

public class MiniMarket {

	public static void main(String[] args) {
		// kullanicinin almis oldugu urun miktarina gore indirim yapiniz
		//1-10 arasi ise %10 -- 11-25 arasi ise=%20 25ten fazla ise %25 uygulayin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen urunun perakende fiyatini giriniz");
double fiyat=scan.nextDouble();
System.out.println("kac adet aldiginizi giriniz");
int adet=scan.nextInt();
double tutar=fiyat*adet;

if (adet<11) {
	System.out.println("toplam borcunuz : "+ tutar*0.90);
}
if (adet<25 && adet>10) {
	System.out.println("toplam borcunuz : "+ tutar*0.80);
	}
if (adet>25) {
	System.out.println("toplam borcunuz : "+ tutar*0.75);
}
	}
}

