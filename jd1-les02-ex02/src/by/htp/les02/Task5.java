package by.htp.les02;

public class Task5 {
    public static void main(String[] args) {
        int n = 6;
        int m = n;
        int[][] mas = new int[n][m];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length -i; j++) {

                mas[i][j] = i+1 ;
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
