package Lesson3.Homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AddTask4 {
    public static void main(String[] args) {
        int min = 9999999;
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
            System.out.print("mas[" + i + "]= " + mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 1) {
                if (mas[i] < min) {
                    min = mas[i];
                }
                System.out.print("mas[" + i + "]= " + mas[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Минимальное значение нечётных элементов= " + min);
    }
}
