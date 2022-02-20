package bigNumber;

import java.math.BigInteger; //memanggil class untuk melakukan operasi matematika bertipe data Big Integer
import java.util.Scanner; 	//memanggil class untuk melakukan inputan pada keyboard

public class bigNumber {

	public static void main(String[] args) {
		BigInteger angka1, angka2, tambah, kali; //deklarasi dengan tipe data Big Integer
		
		Scanner scan = new Scanner(System.in); //membuat Scanner baru dengan nama scan untuk inputan
		angka1 = scan.nextBigInteger(); //menginputkan angka dengan tipe data Big Integer
		angka2 = scan.nextBigInteger();
		scan.close();
		
		tambah = angka1.add(angka2); //melakukan operasi matematika pertambahan angka bertipe Big Integer
		System.out.println(tambah);
		kali = angka1.multiply(angka2); //melakukan operasi matematika perkalian angka bertipe Big Integer
		System.out.println(kali);
	}
}

/*
 * Program ini menjalankan inputan dengan tipe data big integer lalu melakukan operasi matematika
 * dengan tipe data Big Integer
*/
