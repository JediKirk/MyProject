package Lesson6;

public class MethodOverloading {

	void show(int i1) {
		System.out.println(i1);
	}
	void show(boolean b1) {
		System.out.println(b1);
	}
	void show(String s1) {
		System.out.println(s1);
	}
	void show(String s,int a) {
		System.out.println("String: " + s +" int "+a);
	}
	void show(int a,String s) {
		System.out.println("Kakoy good day!!! ");
	}
}
class MethodOverloadingTest{
	public static void main(String [] agrs) {
		MethodOverloading mO= new MethodOverloading();
		int i=500;
		mO.show(i);
		boolean b =true;
		mO.show(b);
		String s = "Pivet!";
		mO.show(s);
		mO.show("Priffki", 10);
		mO.show(10,"sad");
		
		
	}
}
