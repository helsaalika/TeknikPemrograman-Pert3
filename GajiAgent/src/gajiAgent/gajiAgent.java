package gajiAgent;

import java.util.Scanner; //memanggil class untuk melakukan inputan pada keyboard

/**
 * @author Helsa Alika Femiani
 * @version 1.0
 * @since 2022-02-20
 */

public class gajiAgent {

	public static void main(String[] args) {
		int item, gaji;
		
		Scanner scan = new Scanner(System.in); //membuat Scanner baru dengan nama scan untuk inputan
		item = scan.nextInt(); //menginputkan integer
		scan.close(); //menutup scanner
		
		if(item < 15) { //jika item kurang dari 15 
			gaji = 500000 - (((15-item)*50000)* 15/100);
			System.out.println(gaji);
		} else if(item >= 40 && item < 80) { //jika item lebih dari 40 dan kurang dari 80
			gaji = 500000 + ((item*50000) * 25/100);
			System.out.println(gaji);
		} else if (item > 80) { //jika item lebih dari 80
			gaji = 500000 + ((item*50000) * 35/100);
			System.out.println(gaji);
		} else { //jika item lebih dari 15 dan kurang dari 40
			gaji = 500000 + ((item*50000) * 10/100);
			System.out.println(gaji);
		}
	}

}

/*
 * Program ini menjalankan gaji yang diterima pegawai sesuai dengan item yang terjual
 * Program ini akan memeriksa jika :
 * item kurang dari 15 yaitu terjadi denda pemotongan gaji pokok sesuai dengan item yang kurang
 * item lebih dari 40 mendapatkan bonus 25%
 * item lebih dari 80 mendapatkan bonus 35%
 */