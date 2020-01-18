package lesson18;

public class Test5 {
    public static void maxMin(double []array){
        double max=array[0];
        double min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Min element mass: "+min+" Max element mass: "+max);
    }

    public static void main(String[] args) {
        double[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        maxMin(array1);
    }
}
