package by.htp.les01.main;

import java.util.Scanner;

//вычислить значение выражения по формуле (все переменные принимают действительные значения): (b+(b+4ac)^1/2)/2a-a^3*c+b^-2
public class Zadacha2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение a:");
		double a = sc.nextDouble();

		System.out.println("Введите значение b:");
		double b = sc.nextDouble();

		System.out.println("Введите значение c:");
		double c = sc.nextDouble();

		System.out.println((b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - a * a * a * c + Math.pow(b, -2));
		sc.close();
	}
}
