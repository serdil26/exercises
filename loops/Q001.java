package loops;

public class Q001 {

	public static void main(String[] args) {
		/*

	       sayaci ritmik ilerleyen ve adim sayisi belli ise FOR kullanılır.
	       DEGILSE While kullanilir, Eger donguye bir kez mutlaka girilecekse DO_WHILE kullanilir.

	       Problem tanimi
	        100'den 0'a kadar 13'e tam bolunebilen sayilari ve toplamlarini ekrana yazdiriniz (buyukten kucuge).

	         Ekran ciktisi
	        91
	        78
	        65
	        52
	        39
	        26
	        13       */
	int toplam=0;
	for (int i = 100; i >0; i--) {
		if (i%13==0) {
			System.out.print(i + " ");
			toplam+=i;
		}
	} System.out.println(" " + toplam);
System.out.println();
	int top=0;
	for (int i = 1; i <=100; i++) {
		if (i%13==0) {
			System.out.print(i + " ");
			top+=i;
		} 
	}System.out.println(" " + top);
	}

}
