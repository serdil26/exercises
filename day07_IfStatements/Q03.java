package If_Else;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*Write a program in Java to input 5 numbers from keyboard and find their sum and average. Go to the editor

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :

Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5                                                                                
The sum of 5 no is : 15                                                          
The Average is : 3.0  */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 5 adet tam sayi giriniz");
		
		int top=0;
		
		for (int i = 0; i < 5; i++) {
			int sayi=scan.nextInt();
			top +=sayi;
		}
		double ort= top/5;
		System.out.println("Girdiginiz sayilarin toplami: " + top + "  Ortalamasi ise: "+ ort);
	}

}
