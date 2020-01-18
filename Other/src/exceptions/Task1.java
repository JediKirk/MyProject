package exceptions;

public class Task1 {
    public static void main(String[] args) throws IllegalAccessException {
//        System.out.println("AAA");
//        double x=f(-25);
//        System.out.println(x);
    }

    private static double f(double x) throws IllegalAccessException {
        if(x>=0){
            return Math.sqrt(x);
        }else {
            throw  new IllegalAccessException("arg MUSt Be >=0 but " + x);
        }

    }
    private static void register(int age,String name){
        if(age>=0&& name!=null){

        }
    }
}
