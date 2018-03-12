package Lesson_04;

public class Matrix_07_Sort {

	public static void main(String[] args) {
		// 7. Дана матрица размера M × N. Отсортировать ее так, чтоб
		// элементы выстроились в порядке возрастания от номера (0,0) к
		// номеру (M-1,N-1). За каждым последним элементом одной
		// строки идет первый элемент другой.
		int arrsize = 4;
		int[][] arr = new int[arrsize][arrsize];
int n = arr[0].length;

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

		/////// Solution Sort /////////////////////////
//		while (bool) {
//			for (int i = countMin_i; i < max_i; i++) {
//				for (int j = 0; j < max_j; j++) {
//					if ((arr[i][j] < min) && ((min_i != i) || (min_j != j))) {
//						min = arr[i][j];
//						min_i = i;
//						min_j = j;
//						bool = true;
//
//					}
//					if ((arr[i][j] > max) && ((max_i != i) || (max_j != j))) {
//						max = arr[i][j];
//						max_i = i;
//						max_j = j;
//						bool = true;
//					}
//				}
//
//			}
//			
//
//		}
/////////////////////////////
		String s= "Hello";
		
		int tmp = 0;
		for (int i = 0; i < arr.length * arr[0].length - 1; i++) {
			for (int j = 0; j < arr.length * arr[0].length - 1; j++) {
				if(arr[j/n][j%n] > arr[(j+1)/n][(j+1)%n]) {
					tmp = arr[j/n][j%n];
					arr[j/n][j%n] = arr[(j+1)/n][(j+1)%n];
					arr[(j+1)/n][(j+1)%n] = tmp ;
				}
//				if(arr[(j+1)/n][(j+1)%n] > arr[j/n][j%n]) {
//					tmp = arr[(j+1)/n][(j+1)%n];
//					 arr[(j+1)/n][(j+1)%n] = arr[j/n][j%n];
//					 arr[j/n][j%n] = tmp ;
//				}
			}

		}
		//if(mas[j/n][j%n] > mas[(j+1)/n][(j+1)%n])
		///////// End Solution /////////////////////////
		System.out.println("Print new matrix:");
		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// System.out.println("Print new matrix:");
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr[i].length; j++) {
		//
		// System.out.print(arr[i][j] + " ");
		// }
		// System.out.println();
		// }

	}

}
