package lesson20;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList <String> list2= new ArrayList<String>();
        list2.add("poka");
        ArrayList<StringBuilder> list3 = new ArrayList<>();

    }
}

class Student {}
class Car {}
