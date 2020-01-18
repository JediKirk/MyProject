package Lesson3.Homework;

public class AddTask9 {
    public static void main(String[] args) {
        int min = 99999;
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 1000);
            System.out.print("mas[" + i + "]= " + mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i += 2) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("Наименьший элемент среди элементов с чётными индексами= " + min);

    }
}
