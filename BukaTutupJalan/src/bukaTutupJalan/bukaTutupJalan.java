package bukaTutupJalan;

import java.util.Scanner; //memanggil class untuk melakukan inputan pada keyboard

/**
 * @author Helsa Alika Femiani
 * @version 1.0
 * @since 2022-02-20
 */

public class bukaTutupJalan {

	public static void main(String[] args) {
		String plat1, plat2, plat3, plat4, gabungan_plat;
		long hasil;
		
		Scanner scan = new Scanner(System.in); //membuat Scanner baru dengan nama scan untuk inputan
		plat1 = scan.next(); //menginputkan string
		plat2 = scan.next();
		plat3 = scan.next();
		plat4 = scan.next();
		scan.close(); //menutup scanner
		
		gabungan_plat = plat1+plat2+plat3+plat4; //menggabungkan plat1, plat2, plat3, plat4
		hasil = Long.parseLong(gabungan_plat) - 999999; //mengkonversi String ke long lalu dikurang 999999
		hasil = hasil % 5; // hasil dari pengurangan di modulus 5
		if(hasil == 0) { //jika hasil modulus adalah 0
			System.out.println("jalan");
		} else {
			System.out.println("berhenti"); //jika hasil modulus bukan 0
		}
	}

}
/*
 * Program ini menjalankan sebuah perintah untuk menginputkan 4 plat nomor dan menggabungkannya lalu
 * dikurangkan dengan 999999, jika hasil bagi 5 adalah 0 maka program akan menampilkan "Jalan" jika tidak 
 * akan menampilkan "berhenti"
 */