package by.htp.les01.main;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число Z ");
        double z = sc.nextDouble();
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        double[] mas = new double[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextDouble();
        }
        System.out.println("Массив имеет вид: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > z) {
                mas[i] = z;
            }
        }
        System.out.println();
        System.out.println("Массив после замены: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        sc.close();
    }
}
