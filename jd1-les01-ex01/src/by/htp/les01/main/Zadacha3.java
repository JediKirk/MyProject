package by.htp.les01.main;

import java.util.Scanner;

//вычислить значение выражения по формуле (все переменные принимают действительные значения): (sinx+cosy)/(cosx-siny) *tgxy
public class Zadacha3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение x:");
		double x = sc.nextDouble();

		System.out.println("Введите значение y:");
		double y = sc.nextDouble();

		System.out.println("Значение (sin(x)+cos(y))/(cos(x)-sin(y))*tg(xy)= "
				+ (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
		sc.close();
	}
}
