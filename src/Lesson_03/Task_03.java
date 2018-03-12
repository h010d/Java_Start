package Lesson_03;

public class Task_03 {

	public static void main(String[] args) {
		int arr[] = new int[20];
		int min = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		max = arr[0];
		min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}if(arr[i] < min) {
				min = arr[i];
			}
		}
System.out.println("Min = " + min + "\n" + "Max = " + max);
	}

}
