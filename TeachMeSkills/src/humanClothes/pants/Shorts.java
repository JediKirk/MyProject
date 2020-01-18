package humanClothes.pants;

public class Shorts implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надевает шорты");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает шорты");
    }
}
