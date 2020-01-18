package Lesson3.Homework;

public class AddTask2 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int sumNech = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print("mas[" + i + "]= " + mas[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < mas.length; i += 2) {
            sumNech += mas[i];
        }
        System.out.println("Сумма нечетных элементов массива= " + sumNech);
    }

}
