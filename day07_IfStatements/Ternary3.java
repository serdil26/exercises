package If_Else;

import java.util.Scanner;

public class Ternary3 {

	public static void main(String[] args) {
		// kullanicidan aldiginiz sayinin mutlak degerini yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
int sayi1=scan.nextInt();

System.out.print("sayinin mutlak degeri : ");
System.out.print( sayi1<0 ?   sayi1*-1 : sayi1);

	}

}
