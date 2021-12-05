package Alistirma;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 2 sayi giriniz");
double sayi1=scan.nextDouble();
double sayi2=scan.nextDouble();
System.out.println("Lutfen yapmak istediginiz islemi seciniz: \n1. Toplama \n2. Cikarma \n3. Carpma \n4. Bolme");
int secim= scan.nextInt();

if (secim==1) {
	System.out.println("Iki rakamin toplami:" + (sayi1+sayi2));
}else if (secim==2) {
	System.out.println("Iki rakamin farki:" + (sayi1-sayi2));
}else if (secim==3) {
	System.out.println("Iki rakamin carpimi:" + (sayi1*sayi2));
}else if (secim==4) {
	System.out.println("Iki rakamin birbirine orani:" + (sayi1/sayi2));
} else {
	System.out.println("Lutfen gecerli bir tercih yapiniz");
}
	}

}
