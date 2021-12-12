package If_Else;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*5. Write a Java program that keeps a number from the user and 
		 * generates an integer between 1 and 7 and displays the name of the weekday. Go to the editor
	Test Data
	Input number: 3
	Expected Output :
	Wednesday*/
		
	Scanner scan=new Scanner(System.in);
	System.out.println("1 ile 7 arasinda bir sayi giriniz");
	int sayi=scan.nextInt();
	
	if (sayi==1) {
		System.out.println("Girdiginiz sayinin gun karsiligi pazartesi");
	}
	if (sayi==2) {
		System.out.println("Girdiginiz sayinin gun karsiligi sali");
	}
	if (sayi==3) {
		System.out.println("Girdiginiz sayinin gun karsiligi carsamba");
	}
	if (sayi==4) {
		System.out.println("Girdiginiz sayinin gun karsiligi persembe");
	}
	if (sayi==5) {
		System.out.println("Girdiginiz sayinin gun karsiligi cuma");
	}
	if (sayi==6) {
		System.out.println("Girdiginiz sayinin gun karsiligi cumartesi");
	}
	if (sayi==7) {
		System.out.println("Girdiginiz sayinin gun karsiligi pazar");
	} else {
		System.out.println("Lutfen belirtilen sayilardan birini giriniz");
	}
	

	}

}
