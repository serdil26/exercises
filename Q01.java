package ForExercises;

import java.util.Iterator;

public class Q01 {

	public static void main(String[] args) {
		// BIR ARRAY ICERISINDEKI VERILERI (onune merhaba ekleyerek) FOR DONGUSU ILE KONSOLA YAZDIRIN
		
		int []sayilar= {20,30,40,50};
		
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println("merhaba " + sayilar[i]);
		}
		
		String[]aile= {"sezgin", "hacer", "enes","harun","nur"};
		for (int i = 0; i < aile.length; i++) {
			System.out.println(aile[i]);
		}
		
	}

}
