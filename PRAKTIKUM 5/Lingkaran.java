/**
 * Nama file : Lingkaran.java 		02/04/2023
 * Penulis : Nur Annisaa' Meiarti Fajrin
 * Deskripsi : Kelas implementasi IArea berupa cara menghitung Luas Lingkaran
**/

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
	public double jejari;

	public Lingkaran(double r){
		jejari = r;
	}

	public double hitungLuas(){
		return PI * jejari * jejari;
	}
}