package humanClothes.pants;

public class Breeches implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надевает бриджи");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает бриджи");
    }
}
