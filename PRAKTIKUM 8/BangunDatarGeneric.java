/**
 * File      : BangunDatarGeneric.java		17/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : kelas kontruksi generic untuk BangunDatar
 * 
 */
public class BangunDatarGeneric<T extends BangunDatar> {
    private T BangunDatar;

    public void set(T tipeBangunDatar){
        BangunDatar = tipeBangunDatar;
    }

    public T get(){
        return BangunDatar;
    }

    public double hitungKeliling(){
        return BangunDatar.hitungKeliling();
    }
}