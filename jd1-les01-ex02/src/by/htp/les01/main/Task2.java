package by.htp.les01.main;

import java.util.Scanner;

// Найти max[min(a,b), min(c,d)]
public class Task2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите значение a:");
		int a = sc.nextInt();

		System.out.println("Введите значение b:");
		int b = sc.nextInt();

		System.out.println("Введите значение c:");
		int c = sc.nextInt();

		System.out.println("Введите значение d:");
		int d = sc.nextInt();

		int t1, t2 = 0, r;

		if (a < b)
			t1 = a;
		else
			t1 = b;
		if (c < d)
			t2 = c;
		else
			t1 = c;
		if (t1 > t2)
			r = t1;
		else
			r = t2;

		System.out.println("Result: \n" + r);
		sc.close();
	}
}