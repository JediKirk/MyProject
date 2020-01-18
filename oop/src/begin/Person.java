package begin;

public class Person {
    public int height = 177;
    public String name = "Default";

    public Person() {
    }

    public Person(int height, String name) {
        this.height = height;
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void say(String name) {
        System.out.println("Hello " + name);
    }
}
