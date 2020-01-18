package Lesson2.Homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b:");
        int b = sc.nextInt();
        int proizvedenie = 0;

        for (int i = 0; i < b; i++) {
            proizvedenie = proizvedenie + a;
        }
        System.out.println("a*b= " + proizvedenie);
    }
}
