package space;

public class Shuttle implements IStart {


    @Override
    public boolean checkSystem() {
        int m = (int) (Math.random() * 10);
        if (m > 3) {
            return true;
        }
        return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
