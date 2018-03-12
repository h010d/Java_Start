package Lesson_05;

public class Slide_11_Task_004 {

	public static void main(String[] args) {
//		. Поменять все буквы на противоположный регистр.
		String str = "ЖучкарjYTvLjhvj";
		String str1 = str.toUpperCase();
		System.out.println(str1);
		char[] arr = str.toCharArray();
		char[] arr1 = str1.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			if(arr[i] == arr1[i]) {
			
		// arr1[i] = (arr[i]+"").toUpperCase();
			
		}
			else {
				(arr[i] + "").toLowerCase();
			}

	}
		System.out.println(arr);
	}
}
