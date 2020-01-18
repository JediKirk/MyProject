package Homework.Lesson6;

public class OverMet {
	
	
	
	public int sum() {
		int result = 0;
		System.out.println(result);
		return result;	
	}
	public int sum(int a) {
		int	result=a;
		System.out.println(result);
		return result;
	}
	public int sum(int a, int b) {
		int	result=a+b;
		System.out.println(result);
		return result;
	}
	public int sum(int a,int b, int c) {
		int	result=a+b+c;
		System.out.println(result);
		return result;
	}
	public int sum(int a, int b, int c, int d) {
		int	result=a+b+c+d;
		System.out.println(result);
		return result;
	}
}
class OverMetTest{
	public static void main(String [] agrs) {
		OverMet s0 = new OverMet();
		s0.sum();
		OverMet s1 = new OverMet();
		s1.sum(1);
		OverMet s2 = new OverMet();
		s2.sum(2, 3);
		OverMet s3 = new OverMet();
		s3.sum(2, 1, 5);
		OverMet s4 = new OverMet();
		s4.sum();
	}
}
