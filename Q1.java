package Alistirma;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");
        int[] myArr = new int[5];
        for(int i = 0 ; i< arr.length ; i++){
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }
        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[2];
        for(int i = 0 ; i <3 ; i++){
            UseThisArray1[i] = myArr[i];
        }
        for(int i = 3 ; i <5 ; i++){
            UseThisArray2[i-3] = myArr[i];
        }
	}

}
