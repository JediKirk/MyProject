package lesson6.homework;

public class Truck extends GroundTransport {
    double carryingCapacity;

    Truck(int horsePower, int maxSpeed, int mass, String mark, int wheels, double fuelConsumption, double carryingCapacity) {
        super.horsePower = horsePower;
        super.maxSpeed = maxSpeed;
        super.mass = mass;
        super.mark = mark;
        super.wheels = wheels;
        super.fuelConsumption = fuelConsumption;
        this.carryingCapacity = carryingCapacity;
    }

    Truck() {
    }

    double powerKw() {
        double powerKW = horsePower * 0.74;
        return powerKW;
    }

    String printInformation() {
        return "Мощность в л/с:" + horsePower + " Мощность в кВ:" + powerKw() + " Максимальная скорость:" + maxSpeed +
                " Масса:" + mass + " Марка:" + mark + " Кол-во колёс:" + wheels + " Расход топлива:" + fuelConsumption
                + " Грузоподъемность(т):" + carryingCapacity;
    }

    void consumption(double consumption) {
        if (consumption <= fuelConsumption) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
