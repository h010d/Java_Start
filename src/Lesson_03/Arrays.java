package Lesson_03;

public class Arrays {

	public static void main(String[] args) {
		int arr[] = new int[20];

		for (int i = 0; i < arr.length ; i++) {
			arr[i] = (int)( Math.random() * 100 % 40);
		}
		for (int i = 0; i < arr.length; i++) {
System.out.println(arr[i]);
		}
	}

}
