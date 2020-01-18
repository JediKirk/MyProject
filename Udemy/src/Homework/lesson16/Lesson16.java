package Homework.lesson16;

public class Lesson16 {
    public void email(String s) {
        int a = 0;//poziciia simbol @
        int b = 0;// poz simbol .
        int c = 0;//poz simbol ;
        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Lesson16 l16 = new Lesson16();
        l16.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
