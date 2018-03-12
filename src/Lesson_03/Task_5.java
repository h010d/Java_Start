package Lesson_03;

public class Task_5 {

	public static void main(String[] args) {
		int arr[] = new int[30];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		for(int i = 0; i < arr.length; i += 2) {
			System.out.println("arr[i] = " + arr[i]);
		}
		
	}

}
