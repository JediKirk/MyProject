package Lesson7;

public class Employee {
	public double salary;
	
public	void dvoynayaZP() {
	
		double result=salary*2;
		System.out.println("Novaya z/p= "+ result);
		
	}
public	Employee(double salary2){
		salary=salary2;
	}
public static void main (String[] args) {
	Employee emp=new Employee(500);
	System.out.println(emp.salary);
	emp.dvoynayaZP();
}

}
class EmployeeTest{
	public static void main (String[] args) {
		Employee emp=new Employee(400);
		System.out.println(emp.salary);
		emp.dvoynayaZP();
	}

	
}