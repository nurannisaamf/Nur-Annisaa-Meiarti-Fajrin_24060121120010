/**
 * File      : Vehicle.java		03/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : Super Class program
 * 
 */

public class Vehicle {
	void calRent(int distance, float price) { 
		float fare=distance* price; 
		System.out.println("vehicle price = "+fare);
	}
}