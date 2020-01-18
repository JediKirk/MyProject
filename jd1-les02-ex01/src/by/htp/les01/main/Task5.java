package by.htp.les01.main;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива n= ");
        int n = sc.nextInt();
        int[] mas = new int[n];
        System.out.println("Наш массив:");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        System.out.println();
        System.out.println("Массив mas[i] где mas>i: ");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > i) {
                System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
            }
        }
        sc.close();
    }
}
