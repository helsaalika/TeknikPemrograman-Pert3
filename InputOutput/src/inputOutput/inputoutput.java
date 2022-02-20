package inputOutput;

import java.util.Scanner; //untuk melakukan inputan dari keyboard 

/**
 * @author Helsa Alika Femiani
 * @version 1.0
 * @since 2022-02-20
 */

public class inputoutput {

	public static void main(String[] args) {
		String kalimat;
		
		Scanner scan = new Scanner(System.in); //membuat scanner dengan nama scan
		kalimat = scan.nextLine(); 	//inputan yang disimpan di variabel kalimat bertipe data string
		scan.close(); //penutup inputan
		
		String[] kata = kalimat.split("[^A-Za-z]+"); 
		/* split() digunakan untuk memisahkan kata-kata perkata sesuai dengan tanda pemisah 
		   tertentu lalu dimasukkan kedalam array atau biasa disebut Array of String */
		
		for(int i = 0; i < kata.length ; i++) { //melakukan perulangan untuk mengoutputkan kata yang sudah terpisah didalam array
			System.out.println(kata[i]);
		}
		
	}

}

/*
 * Program ini adalah program memisahkan kata perkata dari kalimat yang dimasukkan.
 * Pertama kali program akan menjalankan dengan menginputkan string lalu menggunakan 
 * fungsi split() untuk memisahkan kata-perkata dan dimasukkan pada array lalu 
 * di outputkan hasil yang sudah berupa kata per kata
 */
