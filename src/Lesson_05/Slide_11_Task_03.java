package Lesson_05;

public class Slide_11_Task_03 {

	public static void main(String[] args) {
//		3. Дан массив текстовых значений. Найти самый длинный элемент
//		массива. Создать предложение из входящих в массив строк, самый
//		длинный элемент массива разместить в начале предложения.
		
		String[] string = {
				"Васька", 
				"Петька",
				"Жучкарjhvljhvj",
				"Лайка",
				"Косой",
				"Бегемот",
				"Рыжик",
				"Пыжик"
				};
		int n = string.length;
		System.out.println("N = " + n);
		int num = 0;
		int numIndx = 0;
		for(int i = 0; i < string.length; i++) {
			System.out.println("Array = " + string[i] + " = " + string[i].length());
			if(num < string[i].length()) {
				num = string[i].length();
				numIndx = i;
			
			
		}
					
		}
		System.out.println("Максимальное слово = " + string[numIndx]);
		String[] s1 = new String[string.length];
		s1[0] = string[numIndx];
		for(int i = 0, j = 1; i < string.length; j++, i++) {
			if(i != numIndx) {
				s1[j] = string[i]; 
			} else {
				j--;
			}
		}
		System.out.print("Новый массив:");
		for(int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
				 
			}
	}

}
