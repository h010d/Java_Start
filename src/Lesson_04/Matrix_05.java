package Lesson_04;

public class Matrix_05 {

	public static void main(String[] args) {
		// 5. Дана матрица размера M × N и целые числа K1 и K2. Поменять
		// местами строки матрицы с номерами K1 и K2
		int arrsize = 4;
		int[][] arr = new int[arrsize][arrsize];

		int k1 = 2;
		int k2 = 3;
		int tmp[];
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

 tmp = arr[k1];
 arr[k1] =arr[k2];
 arr[k2] = tmp;
		System.out.println("Print new matrix:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
