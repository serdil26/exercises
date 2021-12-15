package If_Else;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		//kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
		//S girerse: "Software"
		//D girerse; "Developer"
		//E girerse: "Engineer"
		//T girerse; "Tester" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("SDET harflerinden birini veri olarak giriniz");
char kar=scan.next().toUpperCase().charAt(0);

switch (kar) {
case 'S':
	System.out.println("Software");
	break;
case 'D':
	System.out.println("Developer");
	break;
case 'E':
	System.out.println("Engineer");
	break;
case 'T':
	System.out.println("Tester");
	break;

default:
	System.out.println("Istenen harflerden birini giriniz");
	break;
}
	}

}
