package by.htp.les01.main;

import sun.security.krb5.internal.crypto.HmacSha1Aes128CksumType;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int n = 10;
        int[] mas = new int[n];
        // для наглядности заполняем массив числами от 1 до N
        for (int i = 0; i < n; i++) {
            mas[i] = i + 1;
        }
        System.out.println(Arrays.toString(mas));
        int c = 1;
        for (int i = 2; i < n; i += 2) {
            mas[c] = mas[i];
            c++;
        }
        System.out.println(Arrays.toString(mas));
    }
}
