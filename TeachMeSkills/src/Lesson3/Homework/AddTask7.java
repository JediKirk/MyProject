package Lesson3.Homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class AddTask7 {
    public static void main(String[] args) {
        int j = 0;
        int[] mas = new int[15];
        System.out.println("Введите число для проверки");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print("mas[" + i + "]= " + mas[i] + " ");//Наш массив
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == c) {
                j++;
            }
        }
        System.out.println("Введённое число встречается " + j + " раз");
    }
}