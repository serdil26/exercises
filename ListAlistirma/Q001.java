package ListAlistirma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q001 {

	public static void main(String[] args) {
		/*
         * Input olarak verilen listteki isimlerden
         * icinde"a" harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
		/*List<String> isimler= new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
		List<String> liste= new ArrayList<>();
		
		for (String x : isimler) {
			if (!x.toLowerCase().contains("a")) {
				liste.add(x);
			}
		}
		System.out.println(liste); */
		
		String []arr= {"A","B","C","D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
			if (arr[i].equals("C")) {
				continue;
			}
		}
		System.out.println("work done");
	}
	

}
