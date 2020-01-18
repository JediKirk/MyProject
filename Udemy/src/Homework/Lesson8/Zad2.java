package Homework.Lesson8;

public class Zad2 {
	static final double Pi=3.14;
	
	public double S(double radius) {
		double Plojad=Pi*radius*radius;
		return Plojad;
	}
	static double C(double radius2) {
		double DlinOk=Pi*2*radius2;
		return DlinOk;
	}
	public void showInfo(double radius3) {
		System.out.println("Znachenie radiusa= "+ radius3);
		System.out.println("Ego Plojad= " +S(radius3));
		System.out.println("Ego Dlina okryjnosti= "+C(radius3));
		
	}
}
class Zad2Test{
	public static void main(String [] args) {
		Zad2 k1=new Zad2();
		k1.S(9);
		Zad2.C(11);
		k1.showInfo(9);
		
	}
}