package by.htp.les02;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Высота матрицы: ");
        int m = scanner.nextInt();
        System.out.println("Ширина матрицы: ");
        int n = scanner.nextInt();
        System.out.println("Введите к-ю строку которую хотите вывести ");
        int k=scanner.nextInt();
        System.out.println("Введите p-й столбец который хотите вывести ");
        int p=scanner.nextInt();
        int[][] mas = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = r.nextInt(50);
            }
        }
        System.out.println("Сама матрица имеет вид ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" [" + i + "][" + j + "]= " + mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Выводим по условию к-ю строку");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==k){
                    System.out.print(mas[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("Выводим по условию p-й столбец");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j==p){
                    System.out.print(mas[i][j]+" ");
                }
            }
        }

    }
}
