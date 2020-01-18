package Lesson1.Homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number a=  ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number b=  ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number c=  ");
        int c = sc.nextInt();
        int count=0;
        if (a>0){
            count++; }
        if (b>0){
            count++; }
        if (c>0){
            count++; }
        System.out.println("POSITIVE Num = " + count);
        sc.close();
    }
}
