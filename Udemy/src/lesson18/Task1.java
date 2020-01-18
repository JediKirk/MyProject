package lesson18;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = new int[8];
        String[] array2 = new String[3];
        double[][] array3 = new double[4][2];
        int[][] array10 = new int[3][];
        double[] array7=new double[2];

        array2[0]="Privet";
        array2[1]="Poka";
        array2[2]="ok";

        double[] array5=new double[2];
        array5[0]=2.5;
        array5[1]=3.5;
        array7=array5;

        array3[1]=array5;

    }
}
