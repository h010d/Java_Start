package Lesson_05;

public class Slide_11_Task_01 {

	public static void main(String[] args) {
		// Транспонировать матрицу относительно главной диагонали
		int arrSize = 4;
		int arr[][] = new int[arrSize][arrSize];
		int count = 0;
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}

		}
		System.out.println("Print I the matrix: ");
		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + " ");

			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[i].length; j++) {
				tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
			}
		}

		System.out.println("Print II the matrix: ");
		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + " ");

			}
			System.out.println();
		}
	}

}
