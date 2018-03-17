package Lesson_06;

public class Cats {
String name;
private int age;
int size;
String sound;
public Cats(String name, int age) {
	this.name = name;
	this.age = age;
	this.size = 45;
	this.sound = "Myau";
	
}
public Cats(String name, int age, int sz, String snd) {
	this.name= name;
	this.age = age;
	this.size = sz;
	this.sound = snd;
	
}
public void setAge(int Ag) {
	if(age > 0) {
		age = Ag;
	}else {
		age = 0;
		System.out.println("Возраст не может быть меньше 0!");
	}
	
}
public int getAge() {
	return this.age;
}
public void printCats() {
	System.out.println("Name: " + name + " Age: " + getAge()+ " Size: " + size + " " + this.sound );
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cats cat = new Cats("Vaska", 5);
cat.printCats();
	}

}
