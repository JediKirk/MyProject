package lesson6.homework;

public class PassengerTransport extends GroundTransport {
    String bodyType;
    int passengers;


    PassengerTransport(int horsePower, int maxSpeed, int mass, String mark, int wheels, double fuelConsumption, String bodyType, int passengers) {
        super.horsePower = horsePower;
        super.maxSpeed = maxSpeed;
        super.mass = mass;
        super.mark = mark;
        super.wheels = wheels;
        super.fuelConsumption = fuelConsumption;
        this.bodyType = bodyType;
        this.passengers = passengers;
    }

    PassengerTransport() {
    }

    double powerKw() {
        double powerKW = horsePower * 0.74;
        return powerKW;
    }

    String printInformation() {
        return "Мощность в л/с:" + horsePower + " Мощность в кВ:" + powerKw() + " Максимальная скорость:" + maxSpeed
                + " Масса:" + mass + " Марка:" + mark + " Кол-во колёс:" + wheels + " Расход топлива:" + fuelConsumption
                + " Тип кузова:" + bodyType + " Кол-во пассажиров:" + passengers;
    }

    private double fuel(double distance) {
        double fuel = fuelConsumption * distance / 100;
        return fuel;
    }

    void kmInTimeAtMaxSpeed(double time) {
        double distance = time * maxSpeed;
        System.out.println("За время " + time + "ч, автомобиль " + mark + " двигаясь с максимальной скоростью " +
                maxSpeed + "км/ч проедет " + distance + "км и израсходует " + fuel(distance) + " литров топлива.");
    }
}
