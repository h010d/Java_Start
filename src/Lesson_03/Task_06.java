package Lesson_03;

public class Task_06 {

	public static void main(String[] args) {
		int arr[] = new int[]{1, -2, 9, -8 ,11 , -13 };

		for(int i = 0; i < arr.length - 1; i++) {
			if(!(((arr[i] > 0) && (arr[i + 1] <0)) || ((arr[i] < 0) && (arr[i + 1] > 0)))){
				System.out.println("arr[" + i + "] = " + arr[i]);
				break;
			}
			if(i == (arr.length - 2)){
				
				System.out.println( "System = " + 0);
			}

		}


	}

}
