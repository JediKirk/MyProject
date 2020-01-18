package lesson7.homework.task4;

public class Task2 {
    public static void main(String[] args) {
        String s1 = "Привет Вова, как дела?";
        char needToReplaceSymbolPosition3 = s1.charAt(3);
        char replaceSymbolPosition0 = s1.charAt(0);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == needToReplaceSymbolPosition3) {
                s1 = s1.replace(needToReplaceSymbolPosition3, replaceSymbolPosition0);
            }
        }
        System.out.println(s1);
    }
}