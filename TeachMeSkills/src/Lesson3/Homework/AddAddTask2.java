package Lesson3.Homework;

import java.util.Random;
import java.util.Scanner;

public class AddAddTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите кол-во строк массива");
        int n = sc.nextInt();
        System.out.println("Введите кол-во столбцов массива");
        int m = sc.nextInt();
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
        System.out.println("Выведем нечётные элементы под главной диагональю (включительно)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i > j && mas[i][j] % 2 == 1) {
                    System.out.print(" [" + i + "][" + j + "]= " + mas[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}