/**
 * File      : Asersi2.java		02/04/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 *            jari-jari lingkaran yang bernilai nol
 */


//class lingkaran
class Lingkaran{
    private double jariJari;

    //konstruktor
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 5;
        //menguji ekspresi jari jari tidak boleh sama dengan 0
        assert(jariJari > 0): "jari-jari tidak boleh nol";
        //jari jari = 0 false, maka akan diterminate ada kesalahan kode
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/**
 *Pertanyaan : Secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
 *Jawab :
 *Program Asersi2 di atas tidak memiliki masalah konseptual. 
 *Namun, penggunaan asersi harus digunakan dengan hati-hati,
 *karena dapat mempengaruhi kinerja program. 
 *Jika pengujian asersi diaktifkan, program akan memeriksa
 *apakah ekspresi boolean yang diberikan benar atau salah. 
 *Jika salah, program akan menghasilkan AssertionError 
 *dan diberhentikan secara paksa.
 *Dalam program Asersi2, asersi digunakan untuk memeriksa 
 *apakah nilai jari-jari lebih besar dari 0 sebelum membuat objek Lingkaran. 
 *Jika nilai jari-jari sama dengan atau kurang dari 0, 
 *program akan memberikan pesan kesalahan dan diberhentikan. 
 *Hal ini dapat membantu dalam mengurangi kemungkinan bug dalam program.
**/