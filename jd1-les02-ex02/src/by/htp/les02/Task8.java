package by.htp.les02;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        System.out.println("Исходная матрица:\n");

        int n = 5;
        int m = 5;
        int[][] matr = new int[n][m];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                matr[i][j] = (int)(Math.random()*90 + 10);
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите номера столбцов, которые поменяются местами:");
        int k = sc.nextInt();
        int p = sc.nextInt();
        sc.close();

        System.out.println("Матрица после преобразования:\n");

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {

                if (j == k ) {
                    int temp = matr[i][j];
                    matr[i][j] = matr[i][p];
                    matr[i][p] = temp;
                }

                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
