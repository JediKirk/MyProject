package humanClothes.jacket;

public class DownJacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Надевает пуховик");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает пуховик");
    }
}
