/**
 * File      : Sewa.java		03/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : Main Class program
 * 
 */

public class Sewa {
	public static void main(String[] args) {
		Vehicle kendaraan = new Vehicle(); 
		Vehicle mobil = new Car();
		Vehicle bis = new Bus (); 
		kendaraan.calRent (50, 1000); 
		mobil.calRent (50, 1000); 
		bis.calRent (50, 1000);
	}
}