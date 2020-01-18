package Lesson3.Homework;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        char[][] field = new char[3][3];
        Scanner scanner = new Scanner(System.in);
        int stop = 0;
        while (stop == 0) {
            System.out.print("Крестики, введите номер клетки по горизонтали, начиная с 0: ");
            int a = scanner.nextInt();
            System.out.print("Крестики, по вертикали: ");
            int b = scanner.nextInt();
            field[a][b] = 'x';

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(field[i][j] + " | ");
                }
                System.out.println();
            }


            if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][2] == 'x') {
                System.out.println("Победили " + field[0][2]);
                break;
            } else if (field[0][0] == field[1][0] && field[1][0] == field[2][0] && field[2][0] == 'x') {
                System.out.println("Победили " + field[0][0]);

                break;
            } else if (field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[2][1] == 'x') {
                System.out.println("Победили " + field[0][1]);

                break;
            } else if (field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][2] == 'x') {
                System.out.println("Победили " + field[2][0]);

                break;
            } else if (field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[2][2] == 'x') {
                System.out.println("Победили " + field[0][2]);

                break;
            } else if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[2][2] == 'x') {
                System.out.println("Победили " + field[0][0]);

                break;
            } else if (field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][2] == 'x') {
                System.out.println("Победили " + field[1][0]);

                break;
            } else if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2] == 'x') {
                System.out.println("Победили " + field[0][2]);
                break;
            }
            System.out.print("Нолики, введите номер клетки по горизонтали, начиная с 0: ");
            int c = scanner.nextInt();
            System.out.print("Нолики, по вертикали: ");
            int d = scanner.nextInt();
            field[c][d] = '0';
            for (int i = 0; i < 3; i++) {
                    for (int j = 0; j <= 2; j++) {
                        System.out.print(field[i][j] + " | ");
                    }
                    System.out.println();
                }

                if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][2] == '0') {
                    System.out.println("Победили " + field[0][2]);

                    break;
                } else if (field[0][0] == field[1][0] && field[1][0] == field[2][0] && field[2][0] == '0') {
                    System.out.println("Победили " + field[0][0]);

                    break;
                } else if (field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[2][1] == '0') {
                    System.out.println("Победили " + field[0][1]);

                    break;
                } else if (field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][2] == '0') {
                    System.out.println("Победили " + field[2][0]);

                    break;
                } else if (field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[2][2] == '0') {
                    System.out.println("Победили " + field[0][2]);

                    break;
                } else if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[2][2] == '0') {
                    System.out.println("Победили " + field[0][0]);

                    break;
                } else if (field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][2] == '0') {
                    System.out.println("Победили " + field[1][0]);

                    break;
                } else if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2] == '0') {
                    System.out.println("Победили " + field[0][2]);

                    break;
                }
            }
        }
    }
