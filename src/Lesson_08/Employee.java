package Lesson_08;

public abstract class Employee {

	String name;
	String lastName;
	double salary;

	abstract void payrollCalculation();

	public void setName() {
		String arr[] = { "Вася", "Петя", "Женя", "Сергей", "Андрей", "Вадим", "Гриша", "Даша", "Александр", "Юра" };
		name = arr[((int) (Math.random() * arr.length))];
	}

	public void setLastName() {
		String arr[] = { "Смирнов", "Иванов", "Лебедев", "Козлов", "Новиков", "Морозов", "Петров", "Волков", "Васильев",
				"Беляев" };
		lastName = arr[((int) (Math.random() * arr.length))];

	}

	public static void sortSalary(Employee arr[]) {
		Employee tmp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].salary < arr[j + 1].salary) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
	public static void sortName(Employee arr[]) {
		Employee tmp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].salary == arr[j + 1].salary) {
				if ((arr[j].name.compareToIgnoreCase(arr[j + 1].name))>0) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
				}
			}
		}
	}
	public static void printArr(Employee employee[]){
		for (int i = 0; i < employee.length; i++) {
			System.out.printf("%2d", i + 1);
			System.out.print(" | ");
			System.out.printf("%10s", employee[i].name);
			System.out.print(" | ");
			System.out.printf("%10s",employee[i].lastName);
			System.out.print(" | ");
			System.out.printf("%10.2f", employee[i].salary);
			System.out.print(" | ");
			System.out.println("");
			for (int j = 0; j < 43; j++) {
				System.out.print("-");
			}
			System.out.println("");
		}
	}
}
