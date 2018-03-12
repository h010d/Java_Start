package Lesson_04;

public class Matrix_03 {

	public static void main(String[] args) {
		// 3. Дана квадратная матрица A порядка M. Найти сумму элементов
		// ее главной диагонали, то есть диагонали, содержащей следующие
		// элементы:
		// A0,0, A1,1, A2,2, …, AM-1,M-1
		// и среднее арифметическое элементов ее побочной диагонали, то
		// есть диагонали, содержащей следующие элементы:
		// A0,M-1, A1,M–2, A2,M–3, …, AM-1,0.
		int arrsize = 3;
		int[][] arr = new int[arrsize][arrsize];

		int summ = 0;
		int average = 0;
		int count = 1;
		int arrlent = arr.length - 1;
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

		for (int i = 0; i < arr.length; i++) {
			summ += arr[i][i];
		}
		System.out.println("Summ diagonal = " + summ);
		for (int i = arr.length - 1, j = 0; i > 0; i--, j++) {
			average += arr[i][j];
			count++;
		}
		// System.out.println("Summ count = " + count);
		System.out.println("Summ average = " + average / count);

	}

}
