package by.htp.les01.main;

import java.util.Scanner;

//Вычислить значение функции Fx=x^2-3x+9 if x<=3 and Fx=1/(x^3+6) if x>3
public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите значение x: ");
		int x = sc.nextInt();


		if (x <= 3) {
			System.out.println( x * x - 3 * x + 9);
		}
		if (x > 3) {
			System.out.println( 1 / (x * x * x + 6));
		}
		sc.close();
	}
}