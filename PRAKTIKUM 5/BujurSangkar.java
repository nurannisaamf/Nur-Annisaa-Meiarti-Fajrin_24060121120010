/**
 * File      : BujurSangkar.java		02/04/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin
 * Deskripsi : Kelas yang membuat implementasi metode abstrak pada bangun datar
 * 
 */

// turunan dari kelas bangun datar
public class BujurSangkar extends BangunDatar{
	public double hitungLuas(double sisi){ //mengimplementasikan abstract method hitungLuas pada BangunDatar
		luas = sisi * sisi;
		return luas;
	}
}