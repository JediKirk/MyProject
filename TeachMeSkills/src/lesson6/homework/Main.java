package lesson6.homework;

public class Main {
    public static void main(String[] args) {
        Truck cybertruck = new Truck(600, 300, 3500, "Tesla", 4, 15, 3);
        cybertruck.powerKw();
        System.out.println(cybertruck.printInformation());
        cybertruck.consumption(15);
        PassengerTransport model3 = new PassengerTransport(700, 250, 1500, "Lexus", 4, 50, "Sedan", 3);
        model3.kmInTimeAtMaxSpeed(2.5);
        WarAir warAir = new WarAir(9000, 2500, 15000, "Boeing", 5.0, 600, false, 10);
        warAir.fire();
        System.out.println(warAir.printInformation());
        warAir.checkBailoutSystem();

    }
}
