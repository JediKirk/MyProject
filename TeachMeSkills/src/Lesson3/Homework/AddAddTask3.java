package Lesson3.Homework;

import java.util.Random;
import java.util.Scanner;

public class AddAddTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите кол-во строк массива и кол-во столбцов массива");
        int n = sc.nextInt();
        int proizv1 = 1;
        int proizv2 = 1;
        int mas[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = r.nextInt(50);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" [" + i + "][" + j + "]= " + mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            proizv1 *= mas[i][i];
        }
        System.out.println("Произведение главной диагонали =" + proizv1);
        for (int i = 0; i < n; i++) {
            proizv2 *= mas[i][n - 1 - i];
        }
        System.out.println("Произведение побочной  диагонали =" + proizv2);
        if (proizv1 > proizv2) {
            System.out.println("Произведение главной диагонали больше!");
        } else if (proizv2 > proizv1) {
            System.out.println("Произведение побочной диагонали больше!");
        } else {
            System.out.println("Произведение главной и побочной диагонали раны!");
        }
    }
}

