/**
 * File      : ExceptionOnArray.java		02/04/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * 
 */

public class ExceptionOnArray{
    public static void main(String[] args){
        //intanisasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{ //blok try yang digunakan untuk menangkap kesalahan
            //statement yg memungkinkan terjadinya kesalahan
            arrayInteger[2] = 11;
            arrayInteger[3] = 12;
        }
        //catch untuk menangkap kesalahan ArrayIndexOutOfBoundsException
        //apa yang harus dilakukan saat terjadi kesalahan
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        //finally untuk mengeksekusi kode yang selalu dijalankan
        finally{
            System.out.println("clean up code...");
        }
    }
}