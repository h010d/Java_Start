package Lesson_03;

import java.util.Scanner;

public class Task_01 {

	public static void main(String[] args) {
		int N = 100;
		int tmp = 0;
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Введите размер массива: ");
		int arr[] = new int[N];
		for(int i = 0; i < arr.length; i++) {
			tmp = (int)(Math.random() * 100);
			if(((tmp % 2) != 0 )&& (tmp != 0)) {
				arr[i] = tmp;
			}else {
				 tmp = 0;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//scanner.close();

	}

}
