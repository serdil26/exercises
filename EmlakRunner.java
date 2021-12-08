package Alistirma;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmlakRunner {
	
	static String patronId="1";
	static String patronSifre="1";
	
	static String calisanId="2";
	static String calisanSifre= "2";
	
	static Scanner scan=new Scanner(System.in);
	
	static int listeNo =99;
	static String evTipi;
	static String il;
	static int odaSayisi;
	static double fiyat;
	static String stokDurumu;
	
	static ArrayList<Emlak> envanter= new ArrayList<>();
	
	public static void main(String[] args) {
		String Id="";
		String Sifre="";
		boolean girisBasariliMi= true;
		
		while (girisBasariliMi) {
			System.out.println("Nur Emlak Iyi Gunler Diler...");
			System.out.println("ID   :  ");
			Id=scan.next();
			
			System.out.println("Sifre   : ");
			Sifre=scan.next();
			
			if (Id.equals(patronId) && Sifre.equals(patronSifre)) {
				girisBasariliMi=false;
				patron();
				
				
			}else if (Id.equals(calisanId) && Sifre.equals(calisanSifre)) {
				girisBasariliMi=false;
				calisan();
				
			}else System.out.println("Giris Basarisiz");
			
			
		}

	}

	private static void calisan() {
		System.out.println("Gunaydin sayin calisan!");
		
		while (true) {
			System.out.println("\n1-Ekle   \n2-Listele   \n3-Cikis   \nSecenek  :");
			int Secenek= scan.nextInt();
			
			switch (Secenek) {
			case 1:
				Emlak emlak1=new Emlak (listeNo, evTipi, il, odaSayisi, fiyat, stokDurumu);
				envanter.add(emlak1);
				break;
				
			case 2:
				System.out.println("=====================");
				System.out.println("Envanter:  ");
				
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).listeleEmlak();
				}
				System.out.println("Toplam Emlak Sayiniz :  " +envanter.size());
				
				break;
			case 3:
	System.out.println("Gule Gule");
				break;
			

			default:
				System.out.println("Yanlis giris!!");
				
				break;
			}
		}
		
	}

	private static void patron() {
		System.out.println("Gunaydin Patron ");
		
		while (true) {
			System.out.println("\n1-Ekle   \n2-Listele  \n3-Sil   \n4-Duzenle  \nSecenek :");
			int Secenek=scan.nextInt();
			
			switch (Secenek) {
			case 1:
				Emlak emlak1=new Emlak (listeNo, evTipi, il, odaSayisi, fiyat, stokDurumu);
				envanter.add(emlak1);
				break;
				
			case 2:
				System.out.println("=====================");
				System.out.println("Envanter:  ");
				
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).listeleEmlak();
				}
				System.out.println("Toplam Emlak Sayiniz :  " +envanter.size());
				
				break;
			case 3:
	System.out.println("Satilan emlagin liste no'sunu giriniz");
	int silinen=scan.nextInt()-100;
				break;
			case 4:
				for (int i = 0; i < envanter.size(); i++) {
					envanter.get(i).listeleEmlak();
				}
				System.out.println("Hangi emlagi duzenleyeceksiniz?");
	int duzenlenecek=scan.nextInt();
	if (duzenlenecek<envanter.size()) {
		System.out.println("Neyi duzenleyeceksiniz?  \n1-Ev Tipi  \n2-Il  \n3-Oda sayisi  \4-Fiyat" );
	int ne=scan.nextInt();
	}
	
				break;
			case 5:
				System.out.println("Cikis yaptiniz");

			default: 
				System.out.println("Yanlis giris!!!");
				break;
			}
		}
		
	}

}
