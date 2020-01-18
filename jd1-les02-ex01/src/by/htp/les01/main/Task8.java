package by.htp.les01.main;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] mas = new int[n];
        int[] mas2 = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
            }
        }
        System.out.println();
        System.out.println("min= " + min);
        int c = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] != min) {
                c++;
                mas2[c] = mas[i];
                System.out.print("mas2[" + c + "]" + "=" + mas2[c] + " ");
            }
        }
    }
}
