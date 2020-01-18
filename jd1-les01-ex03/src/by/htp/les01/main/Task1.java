package by.htp.les01.main;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		System.out.println("Vvdetite polojitel`noe chislo ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Nepravilnoe chislo!!!!!!");
		}
		int sum = 0;
        for (int i = 1; i < n; i +=1) {
            sum += i;
        }
        System.out.println("Symma  ot 1 do n = " + sum);
        sc.close();
    }
}
