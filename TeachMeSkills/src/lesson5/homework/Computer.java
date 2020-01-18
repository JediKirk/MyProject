package lesson5.homework;

import java.util.Scanner;

public class Computer {
    Scanner sc = new Scanner(System.in);
    String processor;
    int ddr;
    int hdd;
    double cycle;
    int count = 0;


    Computer(String proccesor, int ddr, int hdd, int cycle) {
        this.processor = proccesor;
        this.ddr = ddr;
        this.hdd = hdd;
        this.cycle = cycle;
    }

    void infoComp() {
        System.out.println("Процессор компьютера: " + processor);
        System.out.println("ОЗУ: " + ddr + "Gb");
        System.out.println("Веник: " + hdd + "Gb");
        System.out.println("Ресурс полных циклов работы: " + cycle);
    }

    void oN() {
        int m = (int) (Math.random());
        System.out.println("Попытай удачу( введите 0 или 1)");
        int n = sc.nextInt();
        if (n <= 1 && n >= 0) {
            if (cycle != count && n == m) {
                System.out.println("Прошёл циклов: " + count);
            } else {
                System.out.println("Компудахтер помер=( " + "Прошёл циклов= " + count + " " + m);
                boom();
            }
        } else {
            System.out.println("ТОЛЬКО 1 ИЛИ 0!!!!!");
        }
    }

    void oFF() {
        int m = (int) (Math.random());
        System.out.println("Попытай удачу( введите 0 или 1)");
        int n = sc.nextInt();
        if (n <= 1 && n >= 0) {
            if (cycle != count && n == m) {
                count += 1;
                System.out.println("Прошёл циклов: " + count);

            } else {
                System.out.println("Компудахтер помер=( " + "Прошёл циклов= " + count);
                boom();
            }
        } else {
            System.out.println("ТОЛЬКО 1 ИЛИ 0!!!!!");
        }

    }

    void boom() {
        System.out.println("BOOM!!!!!!!!! SGOREL!");

    }
}

