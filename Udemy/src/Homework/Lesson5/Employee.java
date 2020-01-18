package Homework.Lesson5;

public class Employee {

	int id;
	String surname;
	int age;
	double salary;
	String department;
	
	 Employee(int id2, String surname2, int age2, double salary2, String department2) {
		id=id2;
		surname=surname2;
		age=age2;
		salary=salary2;
		department=department2;
	}
	double uvelichenieZarplati() {
		salary *=2;
		return salary;
		
	}
}

	class EmployeeTest{
	
			public static void main(String[] args) {
				Employee emp1 = new Employee(1,"Lisovskii",24,1000.00,"IT");
				Employee emp2 = new Employee(2,"Duki",21,1855.05,"Microbio");
				
				emp1.uvelichenieZarplati();
				System.out.println("Novaia zp rabotnika "+ emp1.surname+": "+emp1.salary);
				
				double newSalary = emp2.uvelichenieZarplati();
				System.out.println("Novaia zp rabotnika "+ emp2.surname+": "+newSalary);
				
				
				
			}
}