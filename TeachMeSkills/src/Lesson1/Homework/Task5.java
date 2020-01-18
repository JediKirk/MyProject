package Lesson1.Homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number a=  ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number b=  ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number c=  ");
        int c = sc.nextInt();
        int countPosit = 0;
        int countNegat = 0;
        if (a > 0) {
            countPosit++; }
        else if (a < 0) {
            countNegat++; }
        if (b > 0) {
            countPosit++; }
        else if (b < 0) {
            countNegat++; }
        if (c > 0) {
            countPosit++; }
        else if (c < 0) {
            countNegat++; }
        System.out.println("POSITIVE Num = " + countPosit + " " + "NEGATIVE Num = " + countNegat);
        sc.close();
    }
}
