package Lesson2.Homework;

public class Task1 {
    public static void main(String[] args) {
        double firstDistDay = 10;
        double sumKm = 0;

        for (int day = 0; day < 7; day++) {
            sumKm = firstDistDay + sumKm;
            firstDistDay *= 1.1;
        }
        System.out.println("Probejal km za 7 dney " + sumKm);
    }
}
