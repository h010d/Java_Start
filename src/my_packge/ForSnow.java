package my_packge;

public class ForSnow {

	public static void main(String[] args) {
		int lenght1 = 0;
		int lenght = 0;
		for (int i = 0; i < 50000; i++) {
			lenght1 = (int)(Math.random() * 125);
			for (int j = 0; j < lenght1; j++) {
				lenght = (int)(Math.random() * 3);
				for (int x = 0; x < lenght; x++) {
					System.out.print("*");
				}
				lenght = (int)(Math.random() * 6);
				for (int y = 0; y < lenght; y++) {
					System.out.print(" ");
				}

				
			}
			System.out.println(" ");
		}
	}

}
