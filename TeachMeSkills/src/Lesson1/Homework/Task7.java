package Lesson1.Homework;

import java.util.Scanner;


public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kol-vo programmistov = ");
        int n = sc.nextInt();
        String s1 = " программистов";
        String s2 = " программист";
        String s3 = " программиста";
        if (n >= 0)
        if (n == 0) {
                System.out.println(n + s1);}
        else if (n % 100 >= 10 && n % 100 <= 20) {
                System.out.println(n + s1);}
        else if (n % 10 == 1) {
                System.out.println(n + s2);}
        else if (n % 10 >= 2 && n % 10 <= 4) {
                System.out.println(n + s3);}
        else {
                System.out.println(n + s1);}
    }
}