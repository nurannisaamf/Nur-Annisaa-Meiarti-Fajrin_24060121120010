/**
 * File      : AngkaSial.java		02/04/23
 * Penulis   : Nur Annisaa' Meiarti Fajrin
 * Deskripsi : Program penggunaakn exception buatan sendiri
 *             pengenalan klausa 'throw' dan 'throws'
 */

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        //blok try untuk menangkap eksepsi
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){ //jika eksepsi terjadi line kode ini akan dieksekusi
            //method getMessage() untuk mendapatkan pesan dari exception
            //method getmessage() telah ada di class Exception
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/**  
    *Pertanyaan :
    *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
    *Jawab :
    *Tidak, AngkaSialException akan dilemparkan dari metode cobaAngka(int angka) 
    *dan langsung ditangkap oleh blok catch pada main method.
    *Sebagai hasilnya, program akan mencetak pesan kesalahan yang telah ditentukan 
    *di dalam catch block, dan baris 12 pada metode cobaAngka(int angka) 
    *tidak akan dieksekusi untuk angka 13.
    *
    *Pertanyaan :
    *Apakah baris 21 pada angkaSial.java di atas dieksekusi?
    *Jawab :
    *Baris 21 pada AngkaSial.java tidak akan dieksekusi jika tidak terjadi AngkaSialException. 
    *Jika tidak terjadi AngkaSialException, program akan mengeksekusi pernyataan-pernyataan 
    *di dalam blok try tanpa masuk ke blok catch. Sebagai hasilnya, 
    *baris 21 (System.out.println("hati-hati memasukkan angka!!!");) tidak akan dieksekusi.
    *Namun, jika terjadi AngkaSialException, program akan langsung melompat ke blok catch, 
    *mengeksekusi kode di dalamnya, dan kemudian melanjutkan eksekusi setelah blok try-catch.
**/