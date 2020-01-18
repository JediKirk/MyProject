package lesson6.homework;

public class WarAir extends AirTransport {
    boolean bailoutSystem;
    int rockets;

    WarAir(int horsePower, int maxSpeed, int mass, String mark, double wingspan, int runwayLength, boolean bailoutSystem, int rockets) {
        super.horsePower = horsePower;
        super.maxSpeed = maxSpeed;
        super.mass = mass;
        super.mark = mark;
        super.wingspan = wingspan;
        super.runwayLength = runwayLength;
        this.bailoutSystem = bailoutSystem;
        this.rockets = rockets;
    }

    String printInformation() {
        return "Мощность в л/с:" + horsePower + " Максимальная скорость:" + maxSpeed + " Масса:" + mass + " Марка:" +
                mark + " Размах крыльев:" + wingspan + " Длинна полосы взлёта:" + runwayLength +
                " Наличие системы катапультирования:" + bailoutSystem + " Кол-во ракет:" + rockets;
    }

    void fire() {
        if (rockets > 0) {
            System.out.println("Ракета пошла...");
            rockets--;
            System.out.println("Ракет осталось: " + rockets);
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    void checkBailoutSystem() {
        if (bailoutSystem) {
            System.out.println("Cистема катапультирования присутствует");
        } else {
            System.out.println("Cистема катапультирования отсутствует");
        }
    }
}
