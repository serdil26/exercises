package If_Else;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		// kullanicidan bir gunde kac bardak cay ictigi ve caya kac kup seker attigi bilgisini alalim
		//1 yilda ve 40 yillik cay icme seruveninde kac kup seker kullandigini hesaplayalim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Gunde ortalama kac bardak cay icersiniz?");
		int cay=scan.nextInt();
		System.out.println("Cayiniza kac kup seker atarsiniz?");
		int seker=scan.nextInt();
		
		
		int yillikCay= cay*365;
		int yillikSeker=cay*seker*365;
		int otuzYillikCay= yillikCay*30;
		int otuzYillikSeker= yillikSeker*30;
		
		System.out.println("Yillik ictiginiz cay sayisi: " + yillikCay + "bardak");
		System.out.println("Yillik tukettiginiz kup seker miktari: " + yillikSeker);
		System.out.println("30 yilda ictiginiz cay sayisi: " + otuzYillikCay + "bardak");
		System.out.println("30 yilda tukettiginiz kup seker miktari :" + otuzYillikSeker);
		
		if (seker==0) {
			System.out.println("saglikli bir yasami tercih ettiginiz icin tebrikler");
			
		}
		

	}

}
