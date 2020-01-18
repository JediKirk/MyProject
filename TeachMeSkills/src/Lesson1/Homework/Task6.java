package Lesson1.Homework;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number a=  ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number b=  ");
        int b = sc.nextInt();
        if (a>b) {
            System.out.println("a>b a= "+ a); }
        else if (a<b) {
            System.out.println("a<b b= "+ b); }
        else
            System.out.println("a=b");
        sc.close();
    }
}
