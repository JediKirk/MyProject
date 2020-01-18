package Lesson2.Homework;

public class Task8 {
    /*   public static void main(String[] args) {
           System.out.println("   *");
           System.out.println("  **");
           System.out.println(" ***");
           System.out.println("****");

           System.out.println("    ");

           System.out.println("****");
           System.out.println(" ***");
           System.out.println("  **");
           System.out.println("   *");
       }
   }*/
  /*  public static void main(String[] args) {
        int q;
        int k;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
            System.out.print("*"); }
            System.out.println(); }
        for (k = 0; k < 4; k++) {
            for (q = k; q < 4; q++) {
                for (q = k; q < 4; q++){

            System.out.print("*"); }

            System.out.println(); }
        }
    }
}*/
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}