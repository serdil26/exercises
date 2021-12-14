package loops;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// Write a program that prompts the user to input a positive integer. 
		//It should then print the multiplication table of that number. 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Carpim tablosu olusturmak icin lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(sayi + "x"+ i +"=" + (sayi*i));
			
		}

    }
	}


