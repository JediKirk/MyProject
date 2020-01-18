package by.htp.les02;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Высота матрицы: ");
        int m = scanner.nextInt();
        System.out.println("Ширина матрицы: ");
        int n = scanner.nextInt();
        int[][] mas = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = r.nextInt(50);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" [" + i + "][" + j + "]= " + mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Требуемые по условию столбцы матрицы:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j += 2) {
                if (mas[0][j] > mas[m - 1][j]) {
                    System.out.print(" [" + i + "][" + j + "]= " + mas[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
