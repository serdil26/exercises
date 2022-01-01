package loops;

import java.util.Scanner;

public class While01 {

	static int bolum=0;
	
	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
				//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		Scanner scan= new Scanner(System.in);
		System.out.println("bolunen sayisini giriniz");
		int bolunen=scan.nextInt();
		System.out.println("bolen sayisini giriniz");
		int bolen=scan.nextInt();
		
		System.out.println("bolum=" + bol(bolunen, bolen));
	}
	
	public static int bol(int bolunen, int bolen) {
		while(bolunen>=bolen) {
			bolunen-=bolen;
			bolum++;
		}
		
		return bolum;
		
	}

}
