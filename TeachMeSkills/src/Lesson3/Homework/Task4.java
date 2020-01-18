package Lesson3.Homework;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        for (int i = 0; i < mas.length; i++) {//Вводим 20 рандомных элементов [0;20]
            mas[i] = (int) (Math.random() * 21);
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 1) {
                mas[i] = 0;
            }
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
    }
}
