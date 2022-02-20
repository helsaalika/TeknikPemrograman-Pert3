package inputOutput;

import java.util.Scanner; //memanggil class untuk melakukan inputan pada keyboard

/**
 * @author Helsa Alika Femiani
 * @version 1.0
 * @since 2022-02-20
 */

public class inputOutput {

	public static void main(String[] args) {
		String kata;
		int angka;
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 3; i++) { //melakukan perulangan untuk penginputan sebanyak 3 kali
			kata = scan.next();
			angka = scan.nextInt();
			
			System.out.println("==================");
			System.out.printf("%s\t %03d\n", kata, angka); //%03d untuk membuat format integer 000, %s untuk mengoutputkan string
			System.out.println("==================");
		}
		scan.close(); //menutup inputan
	}
}

/*
 * Program ini menjalankan input lalu mengoutputkan hasil yang sudah berformat.
 * program ini memformat agar setiap angka yang dimasukkan akan menghasilkan
 * sebuah format 3 digit angka, dimana jika kita menginputkan 2 digit angka,
 * maka didepan angka tersebut akan terdapat angka 0.
 */