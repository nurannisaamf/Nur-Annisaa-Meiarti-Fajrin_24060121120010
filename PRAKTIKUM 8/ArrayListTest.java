/**
 * File      : ArrayListTest.java		17/05/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin (24060121120010)
 * Deskripsi : program penggunaan objek ArrayList sbg collection class
 * 
 */
import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<String>();
        //menambah elemen
        string.add("Praktikum");
        string.add("collection");
        string.add("dan generics");
        //menghapus elemen
        string.remove("praktikum");
        //iterasi pada keseluruhan ArrayList
        for(String s : string){
            System.out.print(s + " ");
        }
    }
}
		