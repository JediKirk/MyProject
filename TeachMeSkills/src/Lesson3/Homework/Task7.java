package Lesson3.Homework;

public class Task7 {
    public static void main(String[] args) {
        int[] mas = new int[12];
        int max = 0;
        int j = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 16);
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= max) {
                max = mas[i];
                j = i;
            }
        }
        System.out.println("Max= " + max + " Index Max[" + j + "]");
    }
}
