/**
 * File      : Programmer.java		03/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : Kelas yang berisi metode untuk mencetak nama dan gaji pegawai
 * 
 */

public class Programmer extends Pegawai {

    private int bonus = 450000;

    public Programmer(String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}