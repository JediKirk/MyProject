package by.htp.les01.main;

public class Task4 {
    public static void main(String[] args) {
        int swap;
        int imax = 0, imin = 0;
        int[] mas = new int[] { 1, 3, 5, 4, 8 };
        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                imax = i;

            }
            if (mas[i] < min) {
                min = mas[i];
                imin = i;
            }

        }
        swap = mas[imin];
        mas[imin] = mas[imax];
        mas[imax] = swap;
        System.out.println();
        System.out.println("Max= " + max + " Min= " + min);
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "]" + "=" + mas[i] + " ");
        }
    }
}
