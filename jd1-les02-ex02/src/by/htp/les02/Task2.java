package by.htp.les02;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите кол-во строк массива и кол-во столбцов массива");
        int n = sc.nextInt();
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
        System.out.println("Элементы стоящие на диагонялях: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j||i+j==n-1){
                    System.out.print(" [" + i + "][" + j + "]= " + mas[i][j] + " ");
                }
            }
        }
    }
}
