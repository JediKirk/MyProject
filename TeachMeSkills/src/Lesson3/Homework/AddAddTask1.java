package Lesson3.Homework;

import java.util.Random;
import java.util.Scanner;

public class AddAddTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите кол-во строк массива и кол-во столбцов массива");
        int n = sc.nextInt();
        int sum = 0;
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
        for (int i = 0; i < n; i++) {
            if ((mas[i][i] % 2) == 0) {
                sum += mas[i][i];
            }
        }
        System.out.println("Сумма чётных элементов на главной диагонали= " + sum);
    }
}
