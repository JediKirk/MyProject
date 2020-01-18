package Homework.Lesson7;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1= new Employee(5);
		Employee emp2= new Employee("Duki");
	//	Employee emp3= new Employee(55.5);
		
		System.out.println(emp1.id);
		System.out.println(emp1.surname);
	//	System.out.println(emp1.salary);

		System.out.println(emp2.id);
		System.out.println(emp2.surname);
	//	System.out.println(emp2.salary);
		
		emp1.getId();
		emp1.getSurname();
		emp1.getSalary();

		emp2.getId();
		emp2.getSurname();
		emp2.getSalary();
	}
}
