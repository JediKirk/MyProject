package by.htp.les01.main;

		import java.util.Scanner;
//Узнаем значение функции z=((a-3)*b/2)+c
public class Functuion {
	public static void main(String[] args) {
		System.out.println("Узнаем значение функции z=((a-3)*b/2)+c ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение a:");
		int a = sc.nextInt();

		System.out.println("Введите значение b:");
		int b = sc.nextInt();

		System.out.println("Введите значение c:");
		int c = sc.nextInt();

		int z = ((a - 3) * b / 2) + c;
		System.out.println("((a-3)*b/2)+c= " + z);
		sc.close();
	}

}
