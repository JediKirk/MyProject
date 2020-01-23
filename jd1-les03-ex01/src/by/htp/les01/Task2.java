package by.htp.les01;

public class Task2 {
    public static void main(String[] args) {
        String s = "word word wooord wodr wrdo word";
        replace(s);
    }

    public static void replace(String s) {
        for (int i = 0; i < s.length(); i++) {
            s = s.replace("word", "letter");
        }
        System.out.println(s);
    }
}
