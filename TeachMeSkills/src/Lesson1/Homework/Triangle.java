package Lesson1.Homework;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the offcut length A=  ");
        int a = sc.nextInt();
        System.out.println("Enter the offcut length B=  ");
        int b = sc.nextInt();
        System.out.println("Enter the offcut length C=  ");
        int c = sc.nextInt();


        if (a+b>c && a+c>b&& b+c>a) {
            System.out.println("Triangle exists "); }
        else {
            System.out.println("Triangle not exists"); }
        sc.close();
    }
}
