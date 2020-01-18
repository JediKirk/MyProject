package lesson5.stud;

import java.util.Scanner;

public class Student extends Human {
    boolean[] homeWork;
    static int countStudents = 0;

    Student(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        homeWork = new boolean[10];
        countStudents++;
    }

    Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st name:");
        setFirstName(sc.nextLine());
        System.out.println("Enter last name:");
        setLastName(sc.nextLine());
        System.out.println("Enter age:");
        setAge(sc.nextInt());
        homeWork = new boolean[10];
        countStudents++;
    }

    void printInformation() {
        System.out.println(getFirstName());
        System.out.println(getLastName());
        System.out.println(getAge());
    }

    String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    String getFullName(String prexif) {
        return prexif + getFirstName() + " " + getLastName();
    }

    void birthDay() {
        setAge(getAge() + 1);
    }

    void doHomeWork(int i) {
        homeWork[i] = true;
    }

    int[] getHomeWorkDone() {
        int doneHomeWork = 0;
        for (int i = 0; i < homeWork.length; i++) {
            if (homeWork[i]) {
                doneHomeWork++;
            }
        }
        int[] getHomeWorkDone = new int[doneHomeWork];
        int count = 0;
        for (int i = 0; i < homeWork.length; i++) {
            if (homeWork[i]) {
                getHomeWorkDone[count] = i;
                count++;
            }
        }
        return getHomeWorkDone;
    }

    static int getNumberOfStudents() {
        return countStudents;
    }

    @Override
    void greet() {
        super.greet();
        System.out.println(" and I`m student =`(");
    }
}
