package lesson15;

public class Test9 {
    public static void main(String[] args) {

        int chas = 0;
        OUTER:
        do {
            int minyta = 0;
            INNER:
            while (minyta < 60) {
                System.out.println(chas + ":" + minyta);
                minyta++;
            }
            chas++;
        } while (chas < 24);


    }
}


