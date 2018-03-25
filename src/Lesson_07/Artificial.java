package Lesson_07;

public class Artificial extends Flower {
	String material;

	public Artificial(String material) {
		super();
		this.material = material;
	}
	public Artificial() {
		super();
		this.setNameMaterialDefault();
	}
	public void setNameMaterialDefault() {
		String arr[] = { "Бумага", "Пластик", "Камень", "Дерево", "Ткань" };
		this.material = arr[((int) (Math.random() * arr.length))];
		
	}
}
