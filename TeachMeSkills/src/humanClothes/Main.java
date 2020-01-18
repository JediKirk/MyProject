package humanClothes;

import humanClothes.jacket.Coat;
import humanClothes.jacket.DownJacket;
import humanClothes.pants.Breeches;
import humanClothes.pants.Shorts;
import humanClothes.shoes.Sneakers;
import humanClothes.shoes.Treads;

public class Main {
    public static void main(String[] args) {


        Coat coat = new Coat();
        DownJacket downJacket = new DownJacket();
        Breeches breeches = new Breeches();
        Shorts shorts = new Shorts();
        Sneakers sneakers = new Sneakers();
        Treads treads = new Treads();


        Human human1 = new Human("Tanya", coat, shorts, treads);
        Human human2 = new Human("Richard", downJacket, breeches, sneakers);

        human1.putOnAll();
        System.out.println();
        human2.takeOffAll();
    }
}