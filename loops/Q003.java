package loops;

import java.util.Iterator;
import java.util.Scanner;

public class Q003 {
	
	// syso icinde 5*5 yildiz seklini yazdiriniz
	/*   *****
	     *****
	     *****
	     *****
	     *****
	 */

	public static void main(String[] args) {
		for (int i = 0; i <=5; i++) { // satir
			for (int j = 0; j <=5; j++)  //sutun
				System.out.print("*");
				
			
			System.out.println();
		}
		/*  Problem tanimi
	       2 boyutlu bir tablo olarak, ekrana carpi tablosunu hesaplayip yazan kodu yaziniz

	       ornek ekran ciktisi
	       1  2  3  4  5
	       2  4  6  8 10
	       3  6  9 12 15
	       4  8 12 16 20
	       5 10 15 20 25

	    
	    */
		Scanner scan=new Scanner(System.in);
		System.out.println("basit carpim tablosu icin bir sayi giriniz");
		int sayi= scan.nextInt();
		
	for (int i = 1; i <=sayi; i++) {
		for (int j = 1; j <=sayi; j++) {
			System.out.print(" " + i*j);
		}System.out.println();
	}
	/*  Problem Tanimi
    Matrisin boyutunu kullanicidan okuyup.
    Sadece diyagonu (kosegeni) 1 olan ve
    digerer elemanlari 0 olan bir kare matrisi ekrana bastirin.

   Ekran ciktisi
    Bir sayi giriniz: 7
    1000000
    0100000
    0010000
    0001000
    0000100
    0000010
    0000001 */
	
	Scanner scan1=new Scanner(System.in);
	System.out.println("bir tam sayi giriniz");
	int sayi4= scan1.nextInt();
	
	for (int i = 0; i <= sayi4; i++) {
		for (int j = 0; j <=sayi4; j++) {
			if (i==j) {
				System.out.print("1");
			} else {
System.out.print("0");
			}
		}System.out.println();
	}
	
	}
	

}
