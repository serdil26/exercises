package If_Else;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* Take three numbers from the user and print the greatest number. Go to the editor

		Test Data
		Input the 1st number: 
		25
		Input the 2nd number: 78
		Input the 3rd number: 87
		Expected Output :
		The greatest: 87 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("birbirinden farkli 3 tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		
		if (sayi1>sayi2 && sayi1>sayi3) {
			System.out.println(sayi1 + " en buyuk sayidir");
		}
		if (sayi2>sayi1 && sayi2>sayi3) {
			System.out.println(sayi2 + " en buyuk sayidir");
		}
		if (sayi3>sayi1 && sayi3>sayi2) {
			System.out.println(sayi3 + " en buyuk sayidir");
			
		}
			
		

	}

}
