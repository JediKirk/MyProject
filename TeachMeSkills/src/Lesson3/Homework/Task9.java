package Lesson3.Homework;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int n = 0;
        int sum1 = 0;
        int sum2 = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Укажите положительное чётное число(Размер массива)");
            if (sc.hasNext()) {
                n = sc.nextInt();
                if (n > 0 && n % 2 == 0) {
                    int[] mas = new int[n];
                    for (int i = 0; i < mas.length; i++) {
                        mas[i] = (int) (Math.random() * 16);
                        System.out.print(mas[i] + " ");
                    }
                    System.out.println();
                    for (int i = 0; i < mas.length / 2; i++) {
                        sum1 = sum1 + mas[i];
                    }
                    System.out.println("Сумма левой части массива= " + sum1);
                    for (int i = mas.length / 2; i < mas.length; i++) {
                        sum2 = sum2 + mas[i];
                    }
                    System.out.println("Сумма правой части массива= " + sum2);
                    if (sum1 > sum2) {
                        System.out.println("Сумма левой части массива больше!!!");
                    } else if (sum2 > sum1) {
                        System.out.println("Сумма правой части массива больше!!!");
                    } else {
                        System.out.println("Суммы левой и правой части равны!!!");
                    }
                } else {
                    System.out.println("Вводи только правильные числа!!!");
                }
            }
        }
        while (n <= 0 || n % 2 != 0);
    }
}
