package exceptions;

public class Task2 {
    public static void main(String[] args) {

        try {
            calc();
        } catch (StackOverflowError e) {
            System.out.println("rec");
        } catch (OutOfMemoryError e) {
            System.out.println("memory");
        }
    }

    public static void calc() {
        int x = 0;
        try {  
            x = f(888);

        } catch (TooLittleException e) {
            System.out.println("Little: " + x);
        } catch (TooBigException e) {
            System.out.println("Big: " + x);
        }
        System.out.println("ok: " + x);
    }

    private static int f(int k) {
        if (k < -1000) {
            throw new TooLittleException();
        } else if (k > 1000) {
            throw new TooBigException();
        } else if (k == 888) {
            throw new OutOfMemoryError();
        }
        return k * 2;
    }
}
