package by.htp.les02;

public class Task15 {
    public static void main(String[] args) {

        System.out.println("Исходная матрица:\n");

        int max = Integer.MIN_VALUE;

        int n = 5;
        int m = 5;
        int[][] matr = new int[n][m];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                matr[i][j] = (int)(Math.random()*100);
                System.out.printf("%02d ",matr[i][j]);
                if (matr[i][j] > max)  max = matr[i][j];
            }
            System.out.println();
        }

        System.out.println("\nНаибольший элемент матрицы:  " + max);
        System.out.println("\nМатрица после преобразования:\n");

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {

                if (matr[i][j] % 2 != 0) matr[i][j] = max;
                System.out.printf("%02d ",matr[i][j]);
            }
            System.out.println();
        }
    }
}
