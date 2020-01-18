package robot;

import robot.hands.SamsungHand;
import robot.hands.SonyHand;
import robot.hands.ToshibaHand;
import robot.heads.SamsungHead;
import robot.heads.SonyHead;
import robot.heads.ToshibaHead;
import robot.legs.SamsungLeg;
import robot.legs.SonyLeg;
import robot.legs.ToshibaLeg;

import javax.crypto.spec.PSource;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SamsungHand samsungHand=new SamsungHand(10);
        SamsungLeg samsungLeg=new SamsungLeg(15);
        SamsungHead samsungHead=new SamsungHead(100);

        SonyHand sonyHand=new SonyHand(10);
        SonyLeg sonyLeg=new SonyLeg(15);
        SonyHead sonyHead=new SonyHead(80);

        ToshibaHand toshibaHand=new ToshibaHand(6);
        ToshibaLeg toshibaLeg=new ToshibaLeg(8);
        ToshibaHead toshibaHead=new ToshibaHead(69);

        Robot robot1=new Robot(sonyHead,sonyHand,samsungLeg);
        Robot robot2=new Robot(toshibaHead,toshibaHand,sonyLeg);
        Robot robot3=new Robot(samsungHead,sonyHand,toshibaLeg);

        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        System.out.println();

        if(robot1.getPrice()>robot2.getPrice()&&robot1.getPrice()>robot3.getPrice()){
            System.out.println("Первый робот самый дорогой, его цена "+robot1.getPrice()+"$");
        }else if(robot2.getPrice()>robot1.getPrice()&&robot2.getPrice()>robot3.getPrice()){
            System.out.println("Второй робот самый дорогой, его цена "+robot2.getPrice()+"$");
        }else if (robot3.getPrice()>robot1.getPrice()&&robot3.getPrice()>robot2.getPrice()){
            System.out.println("Трейтий робот самый дорогой, его цена "+robot3.getPrice()+"$");
        }else {
            System.out.println("Имеются роботы с одинаковой стоимостью");
        }
    }
}
