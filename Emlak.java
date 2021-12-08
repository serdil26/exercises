package Alistirma;

import java.util.Scanner;

public class Emlak {

	
	public int listeNo;
	public String evTipi;
	public String il;
	public int odaSayisi;
	private double fiyat;
	public String stokDurumu;
	
	public int getListeNo() {
		return listeNo;
	}
	public void setListeNo(int listeNo) {
		this.listeNo = listeNo;
	}
	public String getEvTipi() {
		return evTipi;
	}
	public void setEvTipi(String evTipi) {
		this.evTipi = evTipi;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public int getOdaSayisi() {
		return odaSayisi;
	}
	public void setOdaSayisi(int odaSayisi) {
		this.odaSayisi = odaSayisi;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public String getStokDurumu() {
		return stokDurumu;
	}
	public void setStokDurumu(String stokDurumu) {
		this.stokDurumu = stokDurumu;
	}

	Emlak (int listeNo , String evTipi , String il, int odaSayisi, double fiyat, String stokDurumu  ){
		this.listeNo=listeNo++;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Ev tipi");
		this.evTipi=scan.nextLine();
		
		System.out.println("il");
		this.il=scan.nextLine();
		
		System.out.println("oda sayisi");
		this.odaSayisi=scan.nextInt();
		
		System.out.println("fiyat");
		this.fiyat=scan.nextDouble();
		
		System.out.println("stok durumu");
		
		this.stokDurumu=scan.nextLine();
		
		scan.close();
				
	}
	public void listeleEmlak() {
		System.out.println("\nListe Nu   :" + listeNo + "\nEv Tipi      :"+ evTipi + "\nKonum   : " + il + "\nOda Sayisi  :" +
	 odaSayisi + "\nFiyat      :"+ fiyat  );
	}

}
