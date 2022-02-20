package array;

/**
 * @author Helsa Alika Femiani
 * @version 1.0
 * @since 2022-02-20
 */

public class array {

	public static void main(String[] args) {
		//One Dimensional Arrays
		 int[] fisrtArray = {2, 5, 3};
		 int[] secondArray = {9, 5, 3};
		 int[] thirdArray = {2, 4, 9};
		 int[] fourthArray = {10, 11, 12};
		 int[] fifthArray = {13, 14, 15};
		 int[] sixthArray = {16, 17, 18};
		 int[] seventhArray = {19, 20, 21};
		 int[] eighthArray = {22, 23, 24};
		 int[] ninthArray = {25, 26, 27};
		 
		 //Two Dimensional Arrays
		 int[][] twoDimensionalArray1 = {fisrtArray, secondArray,
		thirdArray};
		 int[][] twoDimensionalArray2 = {fourthArray, fifthArray,
		sixthArray};
		 int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
		ninthArray};
		 
		 //Three Dimensional Array
		 int[][][] threeDimensionalArray = {twoDimensionalArray1,
		twoDimensionalArray2, twoDimensionalArray3};

		 //melakukan perulangan untuk mengoutputkan threeDimensionalArray
		 for(int i = 0; i < 3; i++) { 
			 System.out.print("{");
			 for(int j = 0; j < 3 ; j++) {
				 System.out.print("{");
				 for(int k = 0 ; k < 3 ; k++) {
					 System.out.print(threeDimensionalArray[i][j][k]+" ");
				 }
				 System.out.print("} ");
			 }
			 System.out.println("} ");
		 }
	}
}
/*
 * Program ini menjalankan untuk pengoutputan threeDimensionalArray dimana array tersebut
 * berisi variabel twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3
 * dimana variabel tersebut juga berisi dari array one dimensional.
 */
