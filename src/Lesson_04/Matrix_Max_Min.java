package Lesson_04;

public class Matrix_Max_Min {

	public static void main(String[] args) {
		int arrsize = 3;
		int[][] arr = new int[arrsize][arrsize];

		int max = 0;
		int maxglobal = 0;
		int min = 0;
		int minglobal = 0;
		int arrlent = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]  + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++) {
			min = arr[i][0];
			max = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
				if (max < arr[i][j]) {
					max = arr[i][j];
				}

			}
			if (minglobal > min) {
				minglobal = min;
			}
			if(maxglobal < max) {
				maxglobal = max;
			}
					
			System.out.println("max = " + max + "  min = " + min);
			
		}
		System.out.println("maxmaxglobal  = " + maxglobal + "  minglobal= " + minglobal);

	}

}
