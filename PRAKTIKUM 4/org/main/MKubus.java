/**
* File: MKubus.java 15/03/2023
* Penulis : Nur Annisaa' Meiarti Fajrin
* Deskripsi : Main dari kubus
*/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
	
	System.out.println("Luas Alas Kubus : "+kubus.hitungLuasAlas());
	System.out.println("Volume Kubus : "+kubus.hitungVolume());
	
	}
}