package loops;

import java.util.Iterator;

public class CarpimTablosu {

	public static void main(String[] args) {
		// 1den 10 a kadar olan sayilarin carpim tablosunu  olusturunuz
		
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}System.out.println();
		}

	}

}
