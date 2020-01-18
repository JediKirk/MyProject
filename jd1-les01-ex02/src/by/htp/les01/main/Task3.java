package by.htp.les01.main;

import java.util.Scanner;

// Даны три точки. Определить, будут ли они расположены на одной прямой
public class Task3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение x1:");
		double x1 = sc.nextDouble();

		System.out.println("Введите значение y1:");
		double y1 = sc.nextDouble();

		System.out.println("Введите значение x2:");
		double x2 = sc.nextDouble();

		System.out.println("Введите значение y2:");
		double y2 = sc.nextDouble();

		System.out.println("Введите значение x3:");
		double x3 = sc.nextDouble();

		System.out.println("Введите значение y3:");
		double y3 = sc.nextDouble();

		if ((y1 - y2) * x3 + (x2 - x1) * y3 + (x1 * y2 - x2 * y1) == 0.0) {
			System.out.println("Расположены на одной прямой!");
		}
		if ((y1 - y2) * x3 + (x2 - x1) * y3 + (x1 * y2 - x2 * y1) != 0.0) {
			System.out.println("НЕ расположены на одной прямой!");
		}
		sc.close();
	}
}
