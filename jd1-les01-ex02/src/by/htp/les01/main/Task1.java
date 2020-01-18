package by.htp.les01.main;

import java.util.Scanner;
//Даны два угла треугольника в градусах. Определить , сущ. ли такой треугольник, и если да, то будет ли он прямоугольниым
public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите значение первого угла a:");
		int a = sc.nextInt();
		System.out.println("Введите значение второго угла b:");
		int b = sc.nextInt();


		if ((a + b) >= 180 || (a + b) <= 0) {
			System.out.println("Треугольник НЕ СУЩЕСТВУЕТ!!!");
		}

		if ((a + b) < 180 && (a + b) > 0) {
		}
		System.out.println("Треугольник СУЩЕСТВУЕТ!!!");

		if ((a == 90) || (b == 90) || (a + b == 90)) {
			System.out.println("Треугольник ПРЯМОУГОЛЬНЫЙ!!!");
		}

		sc.close();
	}
}
