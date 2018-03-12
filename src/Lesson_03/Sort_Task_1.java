package Lesson_03;

public class Sort_Task_1 {

	public static void main(String[] args) {
		int arr[] = new int[20];
		int min = 0;
		int max = 0;
		int maxindex = 0;
		int minindex = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		// for (int i = 0; i < arr.length; i++) {
		// System.out.println(arr[i]);
		// }

		max = arr[0];
		min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxindex = i;

			}
			if (arr[i] < min) {
				min = arr[i];
				minindex = i;
			}

		}

		System.out.println("max [" + maxindex + "] =" + max + " min[" + minindex + "] = " + min);

		if (minindex < maxindex) {
			for (int i = minindex; i < maxindex; i++) {
				arr[i] = 0;
			}
		}else {
			for (int i = maxindex + 1; i < minindex + 1; i++) {
				arr[i] = 0;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}
}
