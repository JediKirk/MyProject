package space;

public class Spaceport  {
    void run(IStart istart) {
        if (istart.checkSystem()) {
            System.out.println("Предстартовая проверка прошла успешно!");
            istart.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            istart.start();
        } else {
            System.out.println("Предстартовая проверка провалена! =(");
        }
    }



}
