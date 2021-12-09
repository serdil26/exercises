package Alistirma;

import java.util.Scanner;

public class BuyuktenKucugeSiralama {

	public static void main(String[] args) {
		//Kullanicidan 3 tam sayi ali ve buyukten kucuge siralayin
		
		int a, b, c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 tane tam sayi giriniz");
		
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
System.out.println(" a : " + a + " b : " + b + " c : " + c);

if (a>b &&a>c) {
	if (b>c) {
		System.out.println("a>b>c");
	}else { 
		System.out.println("a>c>b");
			
		}
		
	}else if (b>c && b>a) {
	if (a>c) {
			System.out.println("b>a>c");
		} else {
			System.out.println("b>c>a");
		}
			
	} else {
		if (a>b) {
			System.out.println("c>a>b");
		} else {
System.out.println("c>b>a");
		}
	}
	




	}

}
