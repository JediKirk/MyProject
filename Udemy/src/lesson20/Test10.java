package lesson20;

import java.util.HashMap;
import java.util.Map;

public class Test10 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(777,"Ivanov Michael");
        map.put(666,"Lisovski Pavel");
        map.put(888,"Duki Tanya");
        map.put(555,"Petrov petr");
        map.remove(555);
        System.out.println("map = "+map);
    }
}
