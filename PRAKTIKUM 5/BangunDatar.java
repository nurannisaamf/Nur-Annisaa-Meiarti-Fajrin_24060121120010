/**
 * File      : BangunDatar.java		02/04/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin
 * Deskripsi : Kelas abstrak, berisi abstraksi bangun datar
 * 
 */

public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi); //pada interface hanya bisa seperti ini
	
	public void setLuas(double l){ //tidak bisa pada diinterface karena implementasi
		luas = l; 
	}
	
	public double getLuas(){ //tidak bisa pada diinterface karena implementasi
		return luas;
	}
}