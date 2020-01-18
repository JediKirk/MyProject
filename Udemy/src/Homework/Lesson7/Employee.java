package Homework.Lesson7;



public class Employee {
	private double salary;
	public String surname;
	int id;
	
	
	public Employee(int id2) {
	id=id2;
}
		Employee(String surname2){
			surname=surname2;
		}
	private	Employee(double salary2){
		salary=salary2;
	}
	double dvoynayaZP() {
		
		salary*=2;
		System.out.println("Novaya z/p= "+ salary);
		return salary;
	}
	public void getId() {
		System.out.println("ID= "+id);
	}
	public void getSurname() {
		System.out.println("SURNAME= "+surname);
	}
	public void getSalary() {
		System.out.println("SLARY= "+salary);
	}

}

	
