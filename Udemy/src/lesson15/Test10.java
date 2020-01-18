package lesson15;

public class Test10 {
    public static void main(String[] args) {
        int chas=-1;
        OUTER:
        do {
            chas++;
            int minyta = 0;
            INNER:
            while (minyta < 60) {
                if(minyta==20){
                    continue OUTER;
                }
                System.out.println(chas + ":" + minyta);
                minyta++;
            }

        }while(chas<24);
    }
}
