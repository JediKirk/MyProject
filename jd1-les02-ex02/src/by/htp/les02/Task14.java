package by.htp.les02;

public class Task14 {
    public static void main(String[] args) {


        System.out.println("Искомая матрица:\n");
        int m = 5;
        int n = 10;
        int[][] matr = new int[n][m];
        for (int i = 0; i < matr[0].length; i++) {
            boolean flag = true;
            while (flag) {
                int count = 0;
                for (int j = 0; j < matr.length; j++) {
                    matr[j][i] = (int)(Math.random()*2);
                    if (matr[j][i] == 1) count++;
                }
                if (count == i + 1) flag = false;
            }
        }

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                System.out.printf("%2d ",matr[i][j]);
            }
            System.out.println();
        }
    }
}
