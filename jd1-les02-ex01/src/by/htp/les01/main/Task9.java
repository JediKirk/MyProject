package by.htp.les01.main;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int k = 0, mx, mn, mk, j, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива n= ");
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 5);
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        System.out.println();
        mx = 0;
        mn = mas[0];
        mk = 1;
        for (i = 0; i < n; i++) /*цикл в котором производим необходимые проверки для получения результата*/ {
            for (j = 0; j < n; j++)
                if (mas[i] == mas[j]) {
                    k++;
                }
            if (((mk == k) && (mx > mas[i])) || (mk < k)) /*выбираем меньшее из "одинаковых*/ {
                mx = mas[i];
                mk = k;
            }
            k = 0;
        }
        System.out.println("Минимальное из самых частых= " + mx + " встречено " + mk + " раз");
    }
}
