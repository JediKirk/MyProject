package by.htp.les01;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        String data = "Hello! My age 100. Current time = 23:00";
        int[] digits = findDigits(data);
        int length = digits.length;
        for (int i = 0; i < length; ++i) {
            System.out.print(digits[i] + "  ");
        }
    }

    private static int[] findDigits(String str) {
        int length = str.length(), count = 0;
        char[] data = str.toCharArray();
        int[] result = new int[length];
        for (int i = 0; i < data.length; ++i) {
            if (Character.isDigit(data[i])) {
                result[count++] = Integer.parseInt(Character.toString(data[i]));
            }
        }

        return Arrays.copyOfRange(result, 0, count);
    }
}
