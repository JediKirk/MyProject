package by.htp.les01.main;

import java.util.Scanner;

//Для данной области составить линейную программу , которая печатает true, если точка с координатами (x,y) принадлежит закрашенной области, и false в обратном
public class Zadacha6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите координату x ");
		double x = sc.nextInt();

		System.out.println("Введите координату y ");
		double y = sc.nextInt();

		System.out.println(
				(x >= -4) && (x <= 4) && (y >= -3) && (y <= 4) || (x <= 2) && (x >= -2) && (y <= 4) && (y <= -3));
		sc.close();
	}
}
