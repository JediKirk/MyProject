package by.htp.les01.main;

import java.text.DecimalFormat;
import java.util.Scanner;

//дано действительное число R вида nnn.ddd . Поменять местами дробную и целую части числа и вывести полученное значение числа
public class Zadacha4 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###.###");
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение nnn.ddd: ");
		double nnnddd = sc.nextDouble();
		Math.floor(nnnddd);
		double ddd = nnnddd - Math.floor(nnnddd);
		double f = (double) ddd * 1000 + Math.floor(nnnddd) / 1000;
		System.out.println(df.format(f));
		sc.close();
	}
}
