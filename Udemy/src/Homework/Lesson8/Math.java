package Homework.Lesson8;

public class Math {
	
	
	static int Ymnoj(int a, int b , int c) {
		
		return a*b*c;
	}
	static void Del(int a, int b) {
		System.out.println("Целое частное от деления a/b= "+ a/b+" Остаток от деления a/b " +a%b);
	}
}
class MathTest{
public static void main(String[] args) {


	System.out.println(Math.Ymnoj(2, 3, 6));
	Math.Del(9, 2);
	System.out.println(Math.Ymnoj(222, 5, 7));
	Math.Del(15, 3);
	Math d1=new Math();
}
}