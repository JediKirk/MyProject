package Lesson3.Homework;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[15];
        int count = 0;
        for (int i = 0; i < mas.length; i++) {//Вводим 15 рандомных элементов [0;99]
            mas[i] = (int) (Math.random() * 100);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {//Считаем чётные элементы массива
            if (mas[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print("chetnih elementov v massive= " + count);
    }
}