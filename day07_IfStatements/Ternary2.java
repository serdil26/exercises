package If_Else;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {
		//Kullanicidan bir tam sayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
int sayi1=scan.nextInt();

System.out.println(sayi1% 2==0 ? "sayi cift" : "sayi tek");

	}

}
