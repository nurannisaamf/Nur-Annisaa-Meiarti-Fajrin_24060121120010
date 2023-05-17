/**
 * File      : BangunDatarGenericTest.java		17/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : main class untuk generic bangun datar
 * 
 */
 public class BangunDatarGenericTest{
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = 
            new BangunDatarGeneric <Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " +bdg.hitungKeliling());
        System.out.println("tipe generic : "+bdg.get().getClass().getName());

	Segitiga s = new Segitiga(1,2,3);
        BangunDatarGeneric<Segitiga> bdgs = 
            new BangunDatarGeneric <Segitiga>();
        bdgs.set(s);
        System.out.println("keliling Segitiga : " +bdgs.hitungKeliling());
        System.out.println("tipe generic : "+bdgs.get().getClass().getName());
    }
 }

/*
 public class BangunDatarGeneric<T1 extends BangunDatar>{
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    
    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
 */

/*  
Kesimpulan:
    Ketika T diubah menjadi T1, T2, T1234, dst. maka tetap berjalan tanpa mempengaruhi.
    Jadi variabel generik T merupakan standarisasi.
*/

