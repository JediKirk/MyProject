package Lesson3.Homework;

public class AddTask10 {
    public static void main(String[] args) {
        int max = 0;
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 25);
            System.out.print("mas[" + i + "]= " + mas[i] + " ");
        }
        System.out.println();
        int b = mas[0];
        int imax = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                imax = i;
            }
        }
        System.out.println("Максимальное значение массива =" + max + " ");
        mas[0] = mas[imax];
        mas[imax] = b;
        for (int i = 0; i < mas.length; i++) {                          //Массив после перестановки
            System.out.print("mas[" + i + "]= " + mas[i] + " ");
        }
    }
}
