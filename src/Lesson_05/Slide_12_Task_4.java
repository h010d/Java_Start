package Lesson_05;

public class Slide_12_Task_4 {

	public static void main(String[] args) {
//		4. Создать метод, подсчитывающий количество вхождения подстрок
//		в строку
		String string = "klbj jhbjk kjnkj kjnkj jlk jhvljhvj";
		String strrr = "jh";
int count = countSubstring(string, strrr);
System.out.println("count = " + count);
	}

	public static int countSubstring(String str, String substr) {
		int count = 0;
		int index = 0;
		int index_last = 0;
		while(index != -1) {
			index = str.indexOf(substr, index+1);
			count++;
		}
		return count;
	}
}
