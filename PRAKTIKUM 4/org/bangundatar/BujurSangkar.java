/**
* File: BujurSangkar.java 15/03/2023
* Penulis : Nur Annisaa' Meiarti Fajrin
* Deskripsi : representasi dari objek BujurSangkar 
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas(){
		return panjangSisi * this.panjangSisi;
	}
	
	public double getPanjangSisi() {
		return this.panjangSisi;
	}
}