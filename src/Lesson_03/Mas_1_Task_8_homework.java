package Lesson_03;

public class Mas_1_Task_8_homework {

	public static void main(String[] args) {
		int arrSize = 15;
		int arrA[] = new int[arrSize];
		int arrB[] = new int[arrSize];
		int arrC[] = new int[arrSize];

		for (int i = 0; i < arrSize; i++) {
			arrA[i] = (int) (Math.random() * 10);
			arrB[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < arrSize; i++) {
			System.out.print(" arrA[" + i + "] = " + arrA[i] + ",");
		}
		System.out.println(" ");
		for (int i = 0; i < arrSize; i++) {
			System.out.print(" arrB[" + i + "] = " + arrB[i] + ",");
		}
		for (int i = 0; i < arrSize; i++) {
			if (arrA[i] > arrB[i]) {
				arrC[i] = arrA[i];
			}else {
				arrC[i] = arrB[i];
			}
		}
		System.out.println(" ");
		for (int i = 0; i < arrSize; i++) {
			System.out.print(" arrC[" + i + "] = " + arrC[i] + ",");
		}
	}
}
