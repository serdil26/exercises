package switchCase;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// Girilen bir ay numarasina gore ayin kac gun oldugunu sayi ile yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("Gun sayisini merak ettiginiz ayin numarisini giriniz");
		int ayNo=scan.nextInt();
		
		switch (ayNo) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:	
			System.out.println("Girdiginiz ay 31 gun");
			break;
		case 4:
		case 6:
		case 9:
		case 11:	
			System.out.println("Girdiginiz ay 30 gun");
			break;
		case 2:
			System.out.println("Yili giriniz:");

int yil=scan.nextInt();
if (yil%4==0) {
	System.out.println("girdigini ay 28 gun");
}else {
	System.out.println("girdigini ay 29 gun");
	break;
}
		default:
			System.out.println("hatali deger girdiniz");
			break;
		}

	}

}
