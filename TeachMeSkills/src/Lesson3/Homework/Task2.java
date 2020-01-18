package Lesson3.Homework;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[50];//Создали массив
        for (int i = 0, n = 1; i < mas.length; n = n + 2, i++) {   //Заполняем нечётными значениями до 99]
            mas[i] = n;
        }
        for (int i = mas.length - 1; i >= 0; i--) {        //Выводим в обратном порядке
            System.out.print(mas[i] + " ");
        }
    }
}