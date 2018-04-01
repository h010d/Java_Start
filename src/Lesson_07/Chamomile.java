package Lesson_07;

public class Chamomile extends Living {
	int numberofpetals;

	public Chamomile(int num) {
		super();
		setNumberOfPetals(num);

	}

	public Chamomile() {
		super();
		setNumberOfPetalsDefault();
	}

	public void setNumberOfPetals(int num) {
		if((num > 5) && (num < 12)) {
			this.numberofpetals = num;
		}else {
			System.out.println("Введите значение от 5 до 12");
		}
		
	}
	public int getNumberOfPetals(){
		return this.numberofpetals;
	}
	public void setNumberOfPetalsDefault() {
		this.numberofpetals = (int)((((Math.random() * 100) % 12) + 5));
	}
	
}
