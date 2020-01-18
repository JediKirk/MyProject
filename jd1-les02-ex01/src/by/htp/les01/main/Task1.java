package by.htp.les01.main;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        System.out.println("Введите число К");
        int k = sc.nextInt();
        int sum = 0;
        int[] masA = new int[n];
        for (int i = 0; i < masA.length; i++) {
            masA[i] = i;
            System.out.print("masA[" + i + "]" + "=" + masA[i] + " ");
        }
        for (int i = 0; i < masA.length; i++) {
            if (masA[i] % k == 0) {
                sum += masA[i];
            }
        }
        System.out.println();
        System.out.println("Сумма элементов кратные K= " + sum);
        sc.close();
    }
}