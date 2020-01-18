package by.htp.les01.main;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("Vvdetite tochky otrezka a= ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Vvdetite tochky otrezka b= ");
		int b = sc.nextInt();
		System.out.println("Vvdetite shag h= ");
		int h = sc.nextInt();
		int y;

		for (int x = a; x <= b ; x += h) {
			System.out.print("x= " + x + ",");
			if (x <= 2) {
				y = -x;
				System.out.println("y =" + y);
			} else if (x >= 2) {
				y = x;
				System.out.println("y =" + y);
			}
		}
		sc.close();
	}
}