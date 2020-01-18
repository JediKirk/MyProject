package Homework.lesson14;

public class Time {
    static void time() {
        int chas = 0;
        OUTER:
        while (chas < 6) {
            int minyta = -1;
            MIDDLE:
            do {
                minyta++;
                if (chas > 1 && minyta % 10 == 0) {
                    break OUTER;
                }
                int sec = 0;
                INNER:
                while (sec < 60) {
                    if (sec * chas > minyta) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minyta + ":" + sec);
                    sec++;
                }
            } while (minyta < 59);
            chas++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}
