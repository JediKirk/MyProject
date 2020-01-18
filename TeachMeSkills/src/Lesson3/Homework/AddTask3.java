package Lesson3.Homework;

import java.util.Scanner;

public class AddTask3 {
    public static void main(String[] args) {
        int avgI = 0;
        int j = 0;
        int[] mas = new int[4];
        System.out.println("Введите число С");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print("mas[" + i + "]= " + mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (i > c) {
                j++;
                avgI = (mas[i] + avgI);
            }
        }
        System.out.println("средне арифметическое элементов массива, превосходящих некоторое\n" +
                "число С=" + (double) avgI / j);
    }
}
