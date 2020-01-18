package humanClothes;

import humanClothes.jacket.IJacket;
import humanClothes.pants.IPants;
import humanClothes.shoes.IShoes;

public class Human {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Human() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void putOnAll() {
        System.out.println(getName());
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void takeOffAll() {
        System.out.println(getName());
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
