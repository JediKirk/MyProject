package lesson6.homework;

public class CivilAir extends AirTransport {
    int passengers;
    boolean businessClass;

    CivilAir(int horsePower, int maxSpeed, int mass, String mark, double wingspan, int runwayLength, int passengers, boolean businessClass) {
        super.horsePower = horsePower;
        super.maxSpeed = maxSpeed;
        super.mass = mass;
        super.mark = mark;
        super.wingspan = wingspan;
        super.runwayLength = runwayLength;
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    String printInformation() {
        return "Мощность в л/с:" + horsePower + " Максимальная скорость:" + maxSpeed + " Масса:" + mass + " Марка:" +
                mark + " Размах крыльев:" + wingspan + " Длинна полосы взлёта:" + runwayLength + " Наличие бизнес класса:"
                + businessClass + " Кол-во пассажиров:" + passengers;
    }

    void passengerCapacityCheck(int n) {
        if (n <= passengers) {
            System.out.println("Для всех пассажиров места имеются");
        } else {
            System.out.println("Нужен самолёт побольше");
        }
    }
}

