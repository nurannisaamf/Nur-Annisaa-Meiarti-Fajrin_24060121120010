/**
* File: Kubus.java 15/03/2023
* Penulis : Nur Annisaa' Meiarti Fajrin
* Deskripsi : representasi dari objek Kubus turunan kelas poligon dan BujurSangkar
*/
package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungLuasAlas(){
		return this.permukaan.hitungLuas();
	}

	public double hitungVolume(){
		return this.hitungLuasAlas() * this.permukaan.getPanjangSisi();
	}
	
	
}