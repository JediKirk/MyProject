package Homework.Lesson11;

public class Car {
	String color;
	String engine;
	int doors;

	Car(String color, String engine, int doors) {
		this.color = color;
		this.engine = engine;
		this.doors = doors;
	}
}

class CarTest {
	public static void changeDoors(Car c1) {
		c1.doors = 2;
	}

	public static void changeColor(Car c1, Car c2) {
		Car c3 = new Car(null, null, 0);
		c3.color = c1.color;
		c1.color = c2.color;
		c2.color = c3.color;
	}

	public static void main(String[] args) {
		Car car1 = new Car("Black", "V6", 4);
		Car car2 = new Car("Red", "V8", 6);
		changeDoors(car1);
		changeColor(car1,car2);
		
		System.out.println(car1.doors);
		System.out.println(car1.color);
		System.out.println(car2.color);
	}

}
