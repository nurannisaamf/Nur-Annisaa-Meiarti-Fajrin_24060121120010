/**
 * File      : Car.java		03/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : Sub Class program
 * 
 */

public class Car extends Vehicle{ 
	void calRent(int jarak, float harga) {
	float fare=jarak*harga;
	fare=fare-100.00f;
	System.out.println("harga sewa mobil = "+fare);
	}
}