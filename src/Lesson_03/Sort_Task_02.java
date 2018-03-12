package Lesson_03;

public class Sort_Task_02 {

	public static void main(String[] args) {
		int N = 20;
		int k = 3;
		int m = 9;
		int arr[] = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		 System.out.println(" arr");
		 for (int i = 0; i < arr.length; i++) {
		 System.out.println(arr[i]);
		 }
		 int arrnew[] = new int[N + m];
		 for(int i = 0; i < k; i++) {
			 arrnew[i] = arr[i];
		 }
		 for(int i = k; i < k + m ; i++) {
			 arrnew[i] = 0;
		 }
		 for(int i = (k + m); i < arrnew.length; i++) {
			 arrnew[i] = arr[k++];
		 }
		 System.out.println(" arrnew");
		 for (int i = 0; i < arrnew.length; i++) {
		 System.out.println(arrnew[i]);
		 }

	}

}
