package If_Else;

import java.util.Scanner;

public class TCKimlik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Lutfen 11 haneli TC kimlik nonuzu giriniz");
		Scanner scan=new Scanner(System.in);
		long kimlik=scan.nextLong();
		long ilkHane= kimlik / 10000000000l;
		String yaziTc=  ""+kimlik;
		boolean uzunlukDogruMu= yaziTc.length()==11;
		int sonHane= (int) (kimlik %10);
		
		if (ilkHane!=0 && uzunlukDogruMu==true && sonHane%2==0) {
			System.out.println("Kimlik no basariyla girildi");
		}
		if (ilkHane==0) {
			System.out.println("Ilk hane 0 olamaz!");
		}
	if (uzunlukDogruMu == false) {
		System.out.println("Uzunluk 11 sayidan olusmalidir");
	}
	if (sonHane%2!=0) {
		System.out.println("Son rakam cift olmalidir");
	} 
	}

}
