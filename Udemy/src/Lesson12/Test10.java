package Lesson12;

public class Test10 {

	void abc() {
		String str = null;
		int a = 10;
		if (a >= 10) {
			str = "privet";
		}
		if (a < 10) {
			System.out.println("poka");
		}
		else {
			str="asdasd";
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int maximum=(a>b)?a:b;
		System.out.println(maximum);
		
	}
}
