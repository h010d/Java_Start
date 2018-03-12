package Lesson_03;

public class Part_I_08_Task_10_homework {

	public static void main(String[] args) {
		// 10 Дан массив размера N
		// Поменять порядок его элементов на обратный
		int N = 13;
		int arr[] = new int[N];
		// Initialization an array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);// Print an array
		}
		int tmp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			tmp = arr[i];
			arr[i] = arr[N - 1];
			arr[N - 1] = tmp;
			N--;
		}
		System.out.println("Print a new array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);// Print a new array
		}
	}

}
