package Lesson3.Homework;

import java.util.Random;
import java.util.Scanner;

public class AddAddTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите кол-во строк массива");
        int n = sc.nextInt();
        System.out.println("Введите кол-во столбцов массива");
        int m = sc.nextInt();
        int sum = 0;
        int mas[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = r.nextInt(50);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" [" + i + "][" + j + "]= " + mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Чётные элементы стоящие над побочной диагонью: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - i - 1; j++) {
                if (mas[i][j] % 2 == 0) {
                    System.out.print(" [" + i + "][" + j + "]= " + mas[i][j] + " ");
                    sum = sum + mas[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Сумма четных элементов стоящих над побочной диагональю = " + sum);
    }
}