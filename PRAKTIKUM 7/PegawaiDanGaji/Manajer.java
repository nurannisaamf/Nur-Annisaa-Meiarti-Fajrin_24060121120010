/**
 * File      : Manajer.java		03/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : Kelas yang berisi metode untuk menghitung gaji manajer
 * 
 */

public class Manajer extends Pegawai{
	private int tunjangan = 700000;

	public Manajer(String nama){
		setNama(nama);
	}

	public void tampilData(){
		super.tampilData();
		System.out.printf("Tunjangan: %d\n",tunjangan);
	}	
}