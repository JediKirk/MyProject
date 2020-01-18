package exceptions;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(f());
    }

    static int f() {
        try {
            throw new Error();
        } finally {
            System.out.println("finish");
            return 1;
        }
    }
}
