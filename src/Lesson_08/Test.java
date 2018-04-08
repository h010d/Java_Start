package Lesson_08;

public class Test {

	public static void main(String[] args) {
		Employee employee[] = new Employee[25];
		double rand = 0;
		for (int i = 0; i < employee.length; i++) {
			rand = (((double) (Math.random() * 10)));
			if (rand > 5) {
				employee[i] = new WageRate();
				employee[i].payrollCalculation();
				employee[i].setName();
				employee[i].setLastName();
			} else {
				employee[i] = new HourlyPayment();
				employee[i].payrollCalculation();
				employee[i].setName();
				employee[i].setLastName();
			}

		}
		for (int i = 0; i < employee.length; i++) {
			System.out.println(i+1 + " " +  employee[i].name + " " + employee[i].lastName + " " + employee[i].salary);
		}
		Employee.sortSalary(employee);
		System.out.println("\n New array:\n");
		for (int i = 0; i < employee.length; i++) {
			System.out.println(i+1 + " " +  employee[i].name + " " + employee[i].lastName + " " + employee[i].salary);
		}
		Employee.sortName(employee);
		System.out.println("\n New array:\n");
		for (int i = 0; i < employee.length; i++) {
			System.out.println(i+1 + " " +  employee[i].name + " " + employee[i].lastName + " " + employee[i].salary);
		}
		System.out.println("\n New array:\n");
		for (int i = 0; i < employee.length; i++) {
			System.out.println(i+1 + " " +  employee[i].name + " " + employee[i].lastName + " " + employee[i].salary);
			if(i == 4) {
				i = (employee.length - 4);
				System.out.println("\nПоследние 3 сотрудника\n");
			}
		}
	}

}
