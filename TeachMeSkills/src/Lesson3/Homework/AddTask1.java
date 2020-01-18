package Lesson3.Homework;

public class AddTask1 {
    public static void main(String[] args) {
        int[] mas = new int[5];
        int product = 1;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 3 == 0) {
                product = mas[i] * product;
            }
        }
        System.out.println("Произведение чисел кратные 3= " + product);
    }

}
