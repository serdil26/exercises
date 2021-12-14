package loops;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// Write a program to find the factorial value of any number entered through the keyboard. 

		Scanner scan=new Scanner(System.in);
		System.out.println("Faktoryelini hesaplamak icin lutfen bir tam sayi giriniz");
		int num;
		int sayi=scan.nextInt();
		int fac=1;
		
		for (int i = 1; i <= sayi; i++) {
			fac *=i;
		}
System.out.println("sayinin faktoryeli: "+ fac);
	}

}
