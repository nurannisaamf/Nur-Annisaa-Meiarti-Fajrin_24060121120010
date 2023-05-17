/**
 * File      : Segitiga.java		17/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 * 
 */


public class Segitiga extends BangunDatar {
    private double sisi1;
    private double sisi2;
    private double sisi3;

    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

}
