package Lesson3.Homework;

public class AddTask5 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print("mas[" + i + "]= " + mas[i] + " ");//Наш массив
        }
        System.out.println();
        for (int i = 1; i < mas.length; i += 2) {
            mas[i] = 0;
            System.out.print("mas[" + i + "]= " + mas[i] + " ");//Бахнули в каждый второй элемент значение 0
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "]= " + mas[i] + " ");//Массив который получился !!
        }
    }
}
