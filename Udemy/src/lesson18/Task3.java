package lesson18;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        Arrays.sort(array1);
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println(array1);
//        int index1 = Arrays.binarySearch(array1, 2);
//        System.out.println(index1);

    }
}
