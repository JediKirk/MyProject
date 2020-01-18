package by.htp.les01.main;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива n= ");
        int n = sc.nextInt();
        double[] mas = new double[n];
        double sum = 0;
        System.out.println("Наш массив:");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (Math.random() * 10);
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < mas.length; i += 2) {
            sum += mas[i];
        }
        System.out.println("Сумма элементов ,порядковые номера которых являются простыми числами= " + sum);
        sc.close();
    }
}
