package by.htp.les02;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Искомая матрица:\n");
        int n = 6;
        int m = n;
        int[][] mas = new int[n][m];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {

                if (i % 2 == 0) {
                    mas[i][j] = j + 1;
                } else {
                    mas[i][j] = mas.length - j;
                }

                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
