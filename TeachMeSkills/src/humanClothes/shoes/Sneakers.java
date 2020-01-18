package humanClothes.shoes;

public class Sneakers implements IShoes {

    @Override
    public void putOn() {
        System.out.println("Надевает кроссы");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает кроссы");
    }
}
