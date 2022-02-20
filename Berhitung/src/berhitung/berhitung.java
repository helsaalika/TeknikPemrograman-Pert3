package berhitung;

import java.util.Scanner; //memanggil class untuk melakukan inputan pada keyboard

/**
 * @author Helsa Alika Femiani
 * @version 1.0
 * @since 2022-02-20
 */

public class berhitung {

	public static void main(String[] args) {
		int angka1, angka2, hasil;
		char operator;
		
		Scanner scan = new Scanner(System.in); //membuat Scanner baru dengan nama scan untuk inputan
		angka1 = scan.nextInt(); //menginputkan integer
		operator = scan.next().charAt(0); //menginputkan char untuk mengetahui operator yang akan dipakai
		angka2 = scan.nextInt(); //menginputkan integer
		scan.close(); //menutup scanner
		
		if(operator == '+') { //jika operator "+" maka akan dilakukan pertambahan angka1 + angka2 
			hasil = angka1 + angka2;
			System.out.println(hasil);
		} else if(operator == '-') { //jika operator "-" maka akan dilakukan pengurangan angka1 - angka2
			hasil = angka1 - angka2;
			System.out.println(hasil);
		} else if(operator == '*') { //jika operator "*" maka akan dilakukan perkalian angka1 * angka2
			hasil = angka1 * angka2;
			System.out.println(hasil);
		} else if(operator == '/') { //jika operator "/" maka akan dilakukan pembagian angka1 / angka2
			float hasil_pembagian; //variabel untuk hasil pembagian bertipe float
			hasil_pembagian = (float)angka1 / (float)angka2; //hasil yang akan dioutputkan bertipe data float
			System.out.println(hasil_pembagian);
		} else if(operator == '%') { //jika operator "%" maka akan dilakukan hasil bagi angka1 % angka2
			hasil = angka1 % angka2;
			System.out.println(hasil);
		}
	}
}

/*
 * Program ini menjalankan perintah yang diinputkan user untuk perhitungan matematika
 * seperti pertambahan, pengurangan, perkalian, pembagian, serta modulus atau hasil bagi
 */