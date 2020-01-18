package by.htp.les02;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Последовательность чисел из которых необходимо построить \"магический квадрат\":\n\n" + Arrays.toString(a));
        System.out.println("\n\"Магический квадрат\":\n");

        long count = 0;
        while(a != null) {

            int[][] m = makeMatr(a);
            if (m == null) {
                System.out.println("Матрица не квадратая");
                break;
            }
            if (isMagic(m)) {
                printMatr(m);
                System.out.println();
            }
            count++;
            if (count % 1000000000 == 0) System.out.println("Проверено перестановок:  " + count);

            a = nextComb(a);
        }
        System.out.println("Проверено перестановок:  " + count);
    }


    public static int[] nextComb (int[] a) {
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                int min_val = a[i + 1];
                int min_id = i + 1;
                for (int j = i + 2; j < a.length; j++) {
                    if ((a[j] > a[i]) && a[j] < min_val) {
                        min_val = a[j];
                        min_id = j;
                    }
                }
                int temp = a[i];
                a[i]= a[min_id];
                a[min_id] = temp;

                int h = 0;
                for (int j = i + 1; j < a.length - 1; j++) {
                    for (int k = i + 1; k < a.length - 1 - h; k++) {
                        if (a[k] > a[k + 1]) {
                            int tempSort = a[k];
                            a[k] = a[k + 1];
                            a[k + 1] = tempSort;
                        }
                    }
                    h++;
                }
                return a;
            }
        }
        return null;
    }

    public static int[][] makeMatr (int[] a){

        if (Math.sqrt(a.length) % 1 != 0) return null;

        int n = (int)(Math.sqrt(a.length));
        int[][] m = new int[n][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = a[n * i + j];
            }
        }
        return m;
    }

    public static boolean isMagic (int[][] m) {

        int mag = m.length * (m.length * m.length + 1) / 2;

        int first_sum = m[0][0];
        for (int i = 1; i < m[0].length; i++) {
            first_sum = first_sum + m[0][i];
        }

        if (first_sum != mag) return false;

        int sum_gdiog = 0;
        int sum_pdiog = 0;

        for (int i = 0; i < m.length; i++) {
            int sum_str = 0;
            int sum_stb = 0;
            for (int j = 0; j < m[0].length; j++) {

                sum_str = sum_str + m[i][j];
                sum_stb = sum_stb + m[j][i];

                if (i == j) sum_gdiog = sum_gdiog + m[i][j];
                if (i + j == m.length - 1) sum_pdiog = sum_pdiog + m[i][j];
            }
            if ((sum_str != mag) || (sum_stb != mag)) return false;
        }
        if ((sum_gdiog != mag) || (sum_pdiog != mag)) return false;
        return true;
    }

    public static void printMatr (int[][] m) {
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

