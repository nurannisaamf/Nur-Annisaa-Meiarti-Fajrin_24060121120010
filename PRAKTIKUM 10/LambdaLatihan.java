/**
 * File      : LambdaLatihan.java		06/06/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : program untuk menampilkan key dan value dari sebuah Map,
 *	       dimana key merupakan NIM dan value merupakan nama mahasiswa, 
 *	       menggunakan ekspresi lambda
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaLatihan{
    public static void main(String[] args){
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121120002 :", " Fara Della" );
        mahasiswaMap.put("24060121120006 :", " Zenit Laena" );
        mahasiswaMap.put("24060121120010 :", " Nur Annisaa" );
        mahasiswaMap.put("24060121140154 :", " Mutiara Permata" );

        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + nama));
    }

}