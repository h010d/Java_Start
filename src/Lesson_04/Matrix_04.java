package Lesson_04;

public class Matrix_04 {

	public static void main(String[] args) {
		// 4. Дана матрица размера M × N и целые числа K1 и K2 (0 ≤ K1 < K2 ≤ N).
		// Поменять местами столбцы матрицы с номерами K1 и K2.
		int arrsize = 5;
		int[][] arr = new int[arrsize][arrsize];

		int k1 = 2;
		int k2 = 4;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int tmp = 0;
		for (int j = 0; j < arr[k1].length; j++) {
			tmp = arr[j][k1];
			arr[j][k1] = arr[j][k2];
			arr[j][k2] = tmp;
		}
		System.out.println( "Print new matrix:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
