package Lesson1.Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a=  ");
        int a = sc.nextInt();
        if (a>0) {
            ++a; }//Positive a++ }
        else if (a<0) {
         a=a-2; }//Negative  a-2
        else {
            a=10; } //ZERO NULL (Swap a 10)
        System.out.println(a);
        sc.close();
    }
}
