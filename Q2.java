package ForExercises;

public class Q2 {

	public static void main(String[] args) {
		// 20den 120ye kadar 3 ile tam bolunebilen sayilari for kullanarak konsola yazdirin
		
		
		for (int i = 20; i <= 120; i++) {
			if (i%3==0) {
				System.out.println(i + " java");
			}
			
			if (i%10==0) {
				System.out.println(i + " java guzeldir");
			}
			
		}

	}

}
