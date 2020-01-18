package Lesson3.Homework;

public class Task5 {
    public static void main(String[] args) {
        int[] masA = new int[15];
        int count = 0;
        double sum1 = 0;
        double sum2 = 0;
        double avg1 = 0;
        double avg2 = 0;
        for (int i = 0; i < masA.length; i++) {//Вводим 15 рандомных элементов [0;99]
            masA[i] = (int) (Math.random() * 16);
            sum1 = sum1 + masA[i];
            System.out.print(masA[i] + " ");
        }
        avg1 = sum1 / masA.length;
        System.out.println();
        System.out.println("Avg 1st mas= " + avg1);

        int[] masB = new int[15];
        for (int i = 0; i < masB.length; i++) {//Вводим 15 рандомных элементов [0;99]
            masB[i] = (int) (Math.random() * 16);
            sum2 = sum2 + masB[i];
            System.out.print(masB[i] + " ");
        }
        avg2 = sum2 / masA.length;
        System.out.println();
        System.out.println("Avg 2nd mas= " + avg2);

        if (avg1 > avg2) {
            System.out.println("Среднее арифметическое значение первого массива больше");
        } else if (avg1 < avg2) {
            System.out.println("Среднее арифметическое значение второго массива больше");
        } else {
            System.out.println("Среднее арифметическое значения массивов равны ");
        }
    }
}

