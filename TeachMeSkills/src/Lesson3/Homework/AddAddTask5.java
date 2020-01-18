package Lesson3.Homework;

import java.util.Scanner;

public class AddAddTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк массива");
        int n = sc.nextInt();
        System.out.println("Введите кол-во столбцов массива");
        int m = sc.nextInt();
        int[][] mas = new int[n][];
        int[][] tMatr = new int[m][];

        for (int i = 0; i < tMatr.length; i++) tMatr[i] = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = new int[m];
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 50);
                System.out.print(" [" + i + "][" + j + "]= " + mas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспонируем: ");
        for (int i = 0; i < tMatr.length; i++) {
            for (int j = 0; j < tMatr[i].length; j++) {
                tMatr[i][j] = mas[j][i];
                System.out.print(" [" + i + "][" + j + "]= " + tMatr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
