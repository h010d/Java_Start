package Lesson_04;

public class Matrix_06 {

	public static void main(String[] args) {
		// 6. Дана матрица размера M × N и целое число K (0 ≤ K ≤ M).
		// Удалить строку матрицы с номером K
		int arrsize = 5;
		int[][] arr = new int[arrsize][arrsize];
		int[][] arrnew = new int[arrsize - 1][arrsize];
		int k = 2;
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
		for (int i = 0; i < arrnew.length; i++) {
			for (int j = 0; j < arrnew[i].length; j++) {
				if (i <= k) {
					arrnew[i][j] = arr[i][j];
				}
				else {
					arrnew[i][j] = arr[i + 1][j];
				}

			}

		}

		System.out.println("Print new matrix:");
		for (int i = 0; i < arrnew.length; i++) {
			for (int j = 0; j < arrnew[i].length; j++) {

				System.out.print(arrnew[i][j] + " ");
			}
			System.out.println();
		}

	}

}
