package Lesson3.Homework;

public class Task6 {
    public static void main(String[] args) {
        int[] mas = new int[4];
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 11);
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] >= mas[i + 1]) {
                count = 1;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Последовательность не  возрастает ");
        } else {
            System.out.println("Последовательность строго возрастает ");
        }

    }
}
