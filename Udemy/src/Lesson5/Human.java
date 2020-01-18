package Lesson5;

public class Human {
	String name;
	Car3 car;
	BankAccount bA;
	
	void info() {
		System.out.println("Imya: "+ name+" Cvet mashini: "+ car.color+" Balans bank scheta: "+ bA.balance);
	}
}

class HumanTest{
	public static void main(String[] args) {
		Human h= new Human();
		h.name="Tanya";
		h.car=new Car3("Blue", "V8");
		h.bA= new BankAccount(16,3.89);
		h.info();
	}
}

class Car3{
	Car3(String c, String e){
		color =c;
		engine=e;
	}
	String color ;
	String engine;
}

class BankAccount{
	BankAccount(int id2,double balance2){
		id=id2;
		balance=balance2;
	}
	int id;
	double balance;
}
