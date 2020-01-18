package Lesson6;

public class Employee {
	
	public Employee(int id2, String surname2, int age2){
		this(id2,surname2,age2,0.0,null);
	}
	public Employee(String surname3,int age3){
		this(0,surname3,age3,0.0,null);
	}
	public Employee(int id4, String surname4, int age4, double salary4, String department4){
	id=id4;
	surname=surname4;
	age=age4;
	salary=salary4;
	department=department4;
			
	}
	
	int id;
	String surname;
	int age;
	double salary;
	String department;
	
}
class EmployeeTest{
	public static void main (String[] args) {
		Employee emp1=new Employee(1, "Duki", 21);
		System.out.println(emp1.surname);
		Employee emp2=new Employee("Lisovskii" , 24);
		System.out.println(emp2.department);
		Employee emp3=new Employee(2,"Sichevich" , 21,100.92,"Mircrobio");
		System.out.println(emp3.department);
	}
}