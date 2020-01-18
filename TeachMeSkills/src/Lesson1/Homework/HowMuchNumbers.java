package Lesson1.Homework;

import java.util.Scanner;

public class HowMuchNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();

        if (a>0){
            System.out.print("IT~S POSITIVE!!!! "); }
        else if (a<0){
            System.out.print("IT~S NEGATIVE!!! "); }
        if (Math.abs(a)<10) {
            System.out.println("single digit "  + a);}
            else if ((a>=10 && a<100)||(a<=-10&&a>-100)) {
            System.out.println("double digit number " + a); }
            else if (((a >= 100) && (a < 1000)) || ((a <= -100) && (a > -1000))) {
            System.out.println("triple digit number " + a); }
            else {
            System.out.println("MORE digit number " + a); }

        sc.close();
    }
}