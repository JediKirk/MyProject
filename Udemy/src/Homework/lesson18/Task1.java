package Homework.lesson18;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void showArray(int[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" [" + i + "][" + j + "]= " + array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void sortirovka(int[] array) {
        System.out.println("Our array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        System.out.println();
        System.out.println("Our array after sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        int[][] array2 = new int[5][3];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = r.nextInt(50);
            }
        }
        sortirovka(array1);
        showArray(array2);
    }
}
