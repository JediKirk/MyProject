package by.htp.les01.main;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		System.out.println("Vvdetite Epsilon= ");
		Scanner sc = new Scanner(System.in);
		double e = sc.nextDouble();
		double j = 1;
		double sum = 0;
		double n = 1 / (Math.pow(2, j)) + 1 / (Math.pow(3, j));
		while (n >= e) {
			sum += n;
			j++;
			n = 1 / (Math.pow(2, j)) + 1 / (Math.pow(3, j));
		}
		System.out.println("Symma  = " + sum);
		sc.close();
	}

}
