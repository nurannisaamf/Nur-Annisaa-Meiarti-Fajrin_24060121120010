/**
 * File      : Pegawai.java		03/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : Kelas yang berisi metode untuk menghitung gaji pegawai
 * 
 */

public class Pegawai {

    private String nama;
    private int gajiPokok = 500000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + this.nama + ", " + "Gaji Pokok : " + this.gajiPokok);
    }

}