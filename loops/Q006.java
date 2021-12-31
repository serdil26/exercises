package loops;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		 /*
        Girilen bir stringdeki a harfi sayisini bulunuz.
        ama  c harfine  gelirse donguden cikilsi

        Bugun hava oldukca guzel.-> 2
         str.CharAt(0)

         */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen bir string giriniz");
String str= scan.nextLine();
int aSay= 0;
for (int i = 0; i <= str.length(); i++) {
	if (str.toLowerCase().charAt(i)=='a') {
		aSay++;
	}
	else if (str.toLowerCase().charAt(i)=='c') {
		break;
	}
}
System.out.println("girdiginiz cumledeki a sayisi = " + aSay + " adettir");
	}

}
