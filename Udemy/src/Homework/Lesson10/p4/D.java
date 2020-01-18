package Homework.Lesson10.p4;

import Homework.Lesson10.p1.A;
import Homework.Lesson10.p1.p2.B;
import Homework.Lesson10.p1.p2.p3.C;
import Homework.Lesson10.p4.p5.*;

public class D {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.str1);

		B b = new B();
		b.showBolean();

		C c = new C();
		c.showMessage();

		E e = new E();
		System.out.println(e.xyz);
	}
}
