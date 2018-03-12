package Lesson_04;

public class Matrix_Sneak_Task_08 {

	public static void main(String[] args) {
		// 8. Дана квадратная матрица A порядка M. Начиная с элемента
		// A0,0 и перемещаясь по часовой стрелке, вывести все ее
		// элементы по спирали: первая строка, последний столбец,
		// последняя строка в обратном порядке, первый столбец в
		// обратном порядке, оставшиеся элементы второй строки и т. д.
		int arrSizeRows = 8;
		int arrSizeCols = 8;
		int arr[][] = new int[arrSizeRows][arrSizeCols];
		int count = 0;
		int top = 0;
		int right = arrSizeRows - 1;
		int bottom = arrSizeCols - 1;
		int left = right - 1;
		int start = 0;
		while (count < arrSizeRows * arrSizeCols) {
			for (int i = start; i <= right; i++) {
				arr[top][i] = count++;
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				arr[i][right] = count++;
			}
			right--;
			for (int i = right; i >= start; i--) {
				arr[bottom][i] = count++;
			}
			bottom--;
			for (int i = left; i > start; i--) {
				arr[i][start] = count++;
			}
			start++;
			left--;

		}
		System.out.println("Print the matrix: ");
		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + " ");

			}
			System.out.println();
		}
	}

}
