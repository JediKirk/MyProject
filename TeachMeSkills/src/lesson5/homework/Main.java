package lesson5.homework;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer("i7", 16, 500, 3);
        comp1.infoComp();
        System.out.println();

        while (true){

            System.out.println("Включаем компьютер");
            comp1.oN();
            System.out.println("Выключаем компьютер");
            comp1.oFF();

        }
    }
}
