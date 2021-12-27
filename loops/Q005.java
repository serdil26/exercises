package loops;

public class Q005 {

	public static void main(String[] args) {
		/*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        Seklini yazdiriniz.  65=A'nin ascii degeri
        */
		int harf=64;
		
		for (int satir = 0; satir <8; satir++) {
			
			for (int sutun = 0; sutun <satir; sutun++) {
				System.out.print((char) (harf+sutun) + " ");
			}
			System.out.println();
		}
	}

}
