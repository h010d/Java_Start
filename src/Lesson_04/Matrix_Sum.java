package Lesson_04;

public class Matrix_Sum {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int summ = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				summ += arr[j][i];
				System.out.print(arr[j][i]  + " ");
			}
			
			System.out.println();
		}
		System.out.println("Summ = " + summ);
	}

}
