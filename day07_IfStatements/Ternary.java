package If_Else;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		//KULLANICIDAN 2 SAYI ALIN VE BUYUK OLMAYAN SAYIYI YAZDIRIN
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
int sayi1=scan.nextInt();
int sayi2=scan.nextInt();

System.out.println(sayi1<sayi2 || sayi2>sayi1 ? sayi1 : sayi2);
	}

}
