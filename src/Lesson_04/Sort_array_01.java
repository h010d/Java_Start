package Lesson_04;

public class Sort_array_01 {

	public static void main(String[] args) {
		//Алгоритм сортировки выбором
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()* 15);
		}
		System.out.print("arr[i] \n"); 
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); 
		}
	
		for(int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int min_i = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					min_i = j;
					
				}
			
			}
			if(i != min_i) {
				int tmp = arr[i];
				arr[i] = arr[min_i];
				arr[min_i] = tmp;
			}
		}
		System.out.print("\n arr[i] \n"); 
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); 
		}

	}

}
