/**
 * File      : MapTest.java		17/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * 
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        //Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        //Mengambil elemen pertama
        System.out.println(map.get(1));
        //Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();

        //bagaimana iterasi ntuk mengambil keseluruhan
        //nilai dari kunci ? tulis pada laporan anda!
        //Petunjuk : gunkana iterasi seperti program arrayList
        for(Integer x : map.keySet()){
            System.out.println(x + "." + map.get(x));
        }
    }
}