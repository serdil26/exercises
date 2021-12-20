package If_Else;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		// kullanicinin girmis oldugu 3 basamakli sayinin okunusunu(yazi halini) konsola yazdirin -switchcase ile
		
		Scanner scan=new Scanner(System.in);
		System.out.println("uc haneli bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int yuzler=sayi/100;
		int onlar= sayi/10 %10;
		int birler=sayi %10;
		
		switch (yuzler) {
		case 1: {
			System.out.print("yuz");
			}
		break;
		case 2: {
			System.out.print("ikiyuz");
			}
		break;
		case 3: {
			System.out.print("ucyuz");
			}
		break;
		case 4: {
			System.out.print("dortyuz");
			}
		break;
		case 5: {
			System.out.print("besyuz");
			}
		break;
		case 6: {
			System.out.print("altiyuz");
			}
		break;
		case 7: {
			System.out.print("yediyuz");
			}
		break;
		case 8: {
			System.out.print("sekizyuz");
			}
		break;
		case 9: {
			System.out.print("dokuzyuz");
			}
		break;
		case 0:
			System.out.print("sifir");
			
		}
		switch (onlar) {
		case 1: {
			System.out.print("on");
			}
		break;
		case 2: {
			System.out.print("yirmi");
			}
		break;
		case 3: {
			System.out.print("otuz");
			}
		break;
		case 4: {
			System.out.print("kirk");
			}
		break;
		case 5: {
			System.out.print("elli");
			}
		break;
		case 6: {
			System.out.print("altmis");
			}
		break;
		case 7: {
			System.out.print("yetmis");
			}
		break;
		case 8: {
			System.out.print("seksen");
			}
		break;
		case 9: {
			System.out.print("doksan");
			}
		break;
			
		}
		switch (birler) {
		case 1: {
			System.out.println("bir");
			}
		break;
		case 2: {
			System.out.println("iki");
			}
		break;
		case 3: {
			System.out.println("uc");
			}
		break;
		case 4: {
			System.out.println("dort");
			}
		break;
		case 5: {
			System.out.println("bes");
			}
		break;
		case 6: {
			System.out.println("alti");
			}
		break;
		case 7: {
			System.out.println("yedi");
			}
		break;
		case 8: {
			System.out.println("sekiz");
			}
		break;
		case 9: {
			System.out.println("dokuz");
			}
		break;
		}
		

	 
	}

}
