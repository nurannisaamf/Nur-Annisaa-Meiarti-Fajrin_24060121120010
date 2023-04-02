/**
 * Nama file : MLingkaran.java 		02/04/2023
 * Penulis : Nur Annisaa' Meiarti Fajrin
 * Deskripsi : Implementasi cara menghitung luas lingkaran
**/

import java.util.Scanner;

public class MLingkaran{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jejari lingkaran : ");
		double r = scan.nextDouble();
		Lingkaran l = new Lingkaran (r);
		scan.close();
		System.out.println("Luas lingkaran dengan jejari "+l.jejari+ " adalah "+l.hitungLuas());
	}
}