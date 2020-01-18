package by.htp.les02;

public class Task11 {
    public static void main(String[] args) {

        int count = 0, count1 = 0;
        int[][] matr = new int[10][20];

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = (int) (Math.random() * (10)) ;
            }
        }

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.print("required lines are ");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.print("\nline " + (i + 1));
                count1++;
            }
            count = 0;
        }
        if (count1 == 0) {
            System.out.print("not");
        }
    }
}

