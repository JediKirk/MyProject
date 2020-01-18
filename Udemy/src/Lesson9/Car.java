package Lesson9;

public class Car {
	String color;
	public static int ab = 10; 	  
	String engine;
	public static int count;	
	
	public Car(String color, String engine){
		count++;
		this.color=color;
		this.engine=engine;
	}
	public void showColor() {
		System.out.println("÷вет машины: "+ color);
		changeColor("red");
	}
	public void changeColor(String color2) {
		System.out.println("÷вет машины изменилс€ ");
		int cena=5000;
		color=color2;
		cena+=1000;
	}
}
