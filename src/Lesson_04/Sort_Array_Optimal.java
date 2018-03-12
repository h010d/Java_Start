package Lesson_04;

public class Sort_Array_Optimal {

	public static void main(String[] args) {

		// Алгоритм сортировки выбором
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 15);
		}
		System.out.print("arr[i] \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int min = arr[0];
		int min_i = 0;
		int max = 0;
		int max_i = 0;
		int count = arr.length - 1;
		for (int i = 0; i < count; i++) {
			min = arr[i];
			min_i = i;
			max = arr[i];
			max_i = i;

			for (int j = i + 1; j < count; j++) {
				if (arr[j] < min) {
					min = arr[j];
					min_i = j;

				}
				if (arr[j] > max) {
					max = arr[j];
					max_i = j;
				}

			}
			if (i != min_i) {
				int tmp = arr[i];
				arr[i] = arr[min_i];
				arr[min_i] = tmp;
			}
			if (count != max_i) {
				int tmp = arr[max_i];
				arr[count] = arr[max_i];
				arr[count--] = tmp;
				
			}
			
		}
		System.out.print("\n arr[i] \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
