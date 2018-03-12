package Lesson_03;

public class Mas_1_Task_07 {

	public static void main(String[] args) {
		int N = 3;
		int countNumb = 0;//Если размер массива неизвестен то используем счетчик отдельно
		int count = 0;
		int arr[] = new int[N];// { 0, 0, 2, 1, 2, 2 , 1, 1, 1, 1, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5);

			System.out.println(" arr[" + i + "] = " + arr[i]); // Print array
		}

		for (int i = 0; i < arr.length; i++) {
			//countNumb++;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}

		System.out.println("DifferentElements = " + (N - count));
		//System.out.println("countNumb = " + (countNumb - count)); //Это вариант с неизвестным размером массива
	

 	}

}
