package humanClothes.shoes;

public class Treads implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Надевает ботфорты");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает ботфорты");
    }
}
