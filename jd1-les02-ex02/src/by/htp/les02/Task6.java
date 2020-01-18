package by.htp.les02;

public class Task6 {
    public static void main(String[] args) {
        int n = 6;
        int m = n;
        int[][] mas = new int[n][m];
        for (int i = 0; i < mas.length - i; i++) {
            for (int j = i; j < mas[0].length - i; j++) {

                mas[i][j] = 1;
            }
        }

        for (int i=0; i < mas.length; i++) {
            for (int j = mas[0].length-i-1; j < i+1; j++) {

                mas[i][j] = 1;
            }
        }

        System.out.println("Искомая матрица:\n");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
