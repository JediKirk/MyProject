package by.htp.les01.main;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int negative = 0, positive = 0, zero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        double[] mas = new double[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = ((double) (Math.random() * 31) - 15);
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                positive++;
            } else if (mas[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println();
        System.out.println("Кол-во положительных элементов= " +positive);
        System.out.println("Кол-во отрицательных элементов= " +negative);
        System.out.println("Кол-во элементов равных нулю= " +zero);
        sc.close();
    }
}
