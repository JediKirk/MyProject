package by.htp.les01.main;

import java.util.Scanner;

public class Task7 {
	static void PrintDivisors(int a) {
		System.out.println("�������� ��� ����� " + a + "(�������� ���� ����� � 1): ");
		for (int i = 2; i < a; i++)
			if (a % i == 0)
				System.out.println(i + " ");
		System.out.println("");
	}

	public static void main(String[] args) {
		System.out.println("������� m � n");
		System.out.println("Enter the m= ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("Enter the n= ");
		int n = sc.nextInt();
		if (n < m) {
			System.out.println("�������� ����");
		} else {
			for (int i = m; i <= n; i++)
				PrintDivisors(i);

		}
		sc.close();
	}
}
