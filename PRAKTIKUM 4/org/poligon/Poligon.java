/**
* File : Poligon.java 15/03/2023
* Penulis : Nur Annisaa' Meiarti Fajrin
* Deskripsi : representasi dasar dari poligon
*/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;

	public Poligon() {
		this.jumlahSisi = 0;
	}

	public void setJumlahSisi(int sisi) {
		this.jumlahSisi = sisi;
	}

	public int getJumlahSisi () {
		return this.jumlahSisi;
	}

}