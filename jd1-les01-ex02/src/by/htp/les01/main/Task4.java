package by.htp.les01.main;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите размер отверствия (длина) A:");
		int A = sc.nextInt();

		System.out.println("Введите размер отверствия (высота) B:");
		int B = sc.nextInt();

		System.out.println("Введите размер кирпича (длина) x:");
		int x = sc.nextInt();

		System.out.println("Введите размер кирпича (высота) y:");
		int y = sc.nextInt();

		System.out.println("Введите размер кирпича (ширина) z:");
		int z = sc.nextInt();


		if ((x<A) && (y<B) || (x<B) && (y<A)) {
			System.out.println("Пройдёт через отверствие");
		}
		else

		if ((x<A) && (z<B) || (x<B) && (z<A)) {

			System.out.println("Пройдёт через отверствие");
		}
		else

		if ((y<A) && (z<B) || (y<B) && (z<A)) {

			System.out.println("Пройдёт через отверствие");
		}
		else
			System.out.println("SHALL NOT PASS!!!");

		sc.close();
	}
}
