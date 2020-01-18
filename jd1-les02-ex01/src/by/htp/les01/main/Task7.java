package by.htp.les01.main;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double max = Double.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива n= ");
        int n = sc.nextInt();
        double[] mas = new double[n];
        System.out.println("Наш массив:");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (Math.random() * 10);
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        System.out.println();
        for (int i = 0, j = mas.length - 1; i < j; i++, j--) {
            max = Double.max(max, mas[i] + mas[j]);
        }

        System.out.println("max= " + max);

    }
}