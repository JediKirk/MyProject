package Lesson3.Homework;

public class AddTask6 {
    public static void main(String[] args) {
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20);
            System.out.print("mas[" + i + "]= " + mas[i] + " ");
        }
        System.out.println();
        int k = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    k++;
                    break;
                }
            }
        }
        if (k == 1) {
            System.out.println("Нет, не все разные");
        } else {
            System.out.println("Разные");
        }
    }
}

