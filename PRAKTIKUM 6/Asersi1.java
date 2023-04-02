/**
 * File      : Asersi1.java		02/04/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin
 * Deskripsi : Program untuk menunjukkan asersi
 * 
 */

public class Asersi1{
    public static void main(String[] args){
        int x = 0;
        if(x > 0){
            System.out.println("x bilangan positif");
        }
        else{
            //x tidak kurang dari 0 maka akan diterminate ada kesalahan kode
            assert(x < 0): "ada kesalahan kode"; //menguji asumsi variabel x < 0
            System.out.println("x bilangan negatif");
        }
    }
}