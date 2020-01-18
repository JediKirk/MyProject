package by.htp.les02;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter matrix size: ");
        int size = in.nextInt();


        int[][] matr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matr[i][j] = (int)(Math.random()*100);
            }
        }

        for(int i=0; i < size;i++){
            for (int j=0;j<size;j++){
                System.out.print(matr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (matr[i][i] > 0) {
                System.out.print(matr[i][i]+" ");
            }
        }

    }

}
