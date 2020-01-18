package by.htp.les01.main;

import java.math.BigInteger;

public class Task4 {
	public static void main(String[] args) {
		BigInteger proizSqua = BigInteger.valueOf(1);
		for (int i = 1; i <= 200; i++) {
			proizSqua = proizSqua.multiply(BigInteger.valueOf(i * i));
		}
		System.out.println("Proizvedenie kvadratov pervih 200 chisel= " + proizSqua);
	}
}
