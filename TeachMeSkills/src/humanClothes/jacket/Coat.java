package humanClothes.jacket;

public class Coat implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надевает пальто");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает пальто");
    }
}
