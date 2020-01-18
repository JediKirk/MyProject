package space;

public class SpaceX implements IStart {


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
        System.out.println("Двигатели  запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Roadster полетел в открытый космос!");
    }
}
