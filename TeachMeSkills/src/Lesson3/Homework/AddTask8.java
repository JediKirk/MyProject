package Lesson3.Homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AddTask8 {
    public static void main(String[] args) {
        int max1 = 0;
        int max2 = 0;
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20);
            System.out.print("mas[" + i + "]= " + mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max1) {
                max1 = mas[i];
            }
        }
        System.out.println("Максимальный элемент в массиве= " + max1);
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max2 && mas[i] < max1) {
                max2 = mas[i];
            }
        }
        System.out.println("Второй максимальный элемент в массиве= " + max2);
    }

}

