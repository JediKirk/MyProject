package by.htp.les01.main;

import java.util.Scanner;

//Дано натуральное число T, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах , минутах, секундах.
public class Zadacha5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число ");
		int chislo = sc.nextInt();

		int hours = chislo / 3600;
		int minutes = (chislo % 3600) / 60;
		int seconds = ((chislo % 3600)) % 60;

		System.out.println("Часов " + hours);
		System.out.println("Минут " + minutes);
		System.out.println("Секунд " + seconds);
		sc.close();
	}
}
