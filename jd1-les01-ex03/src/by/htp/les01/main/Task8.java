package by.htp.les01.main;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {

		int c;
		int d;
		System.out.println("Enter the a= ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the b= ");
		int b = sc.nextInt();
		while (a > 0) {
			d = a % 10;
			a = a / 10;
			c = b;
			while (c > 0) {
				if (c % 10 == d) {
					System.out.print(d + " ");
					break;
				}
				c = c / 10;
			}
		}
		sc.close();
	}
}
