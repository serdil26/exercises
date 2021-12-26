package loops;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		// Kullanicidan 5 adet sayi isteyiniz
        // Bu sayilardan 5 ile 10 arasindakiler haric, digerlerinin toplamini bulunuz.
        // bu soruyu continue kullanarak cozunuz
		Scanner scan= new Scanner(System.in);
int toplam=0;

for (int i = 1; i <=5; i++) {
	System.out.print("sayi giriniz : ");
	int sayi=scan.nextInt();
	if (sayi>5 && sayi<10) {
		System.out.println(" 5-10 arasi sayilar isleme girmeyecektir");
		continue;
	} toplam+= sayi;
}
System.out.println("toplam = " + toplam);
	} 

}
