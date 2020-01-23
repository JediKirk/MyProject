package by.htp.les01;

public class Task3 {
    public static void main(String[] args) {
        String s = "12as3da4s5a6d78";
        System.out.println("В строке имеется "+searchNumeral(s)+" цифр");
    }

    public static int searchNumeral(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
