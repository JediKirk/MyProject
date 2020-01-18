package Lesson2.Homework;

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 256; i*=2) {
            sum = i + sum;

        }
        System.out.println("Sum 1+2+4+8+...+256= " + sum);
    }
}
