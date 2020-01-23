package generics;

import java.util.ArrayList;

public class HolderStringTest {
    public static void main(String[] args) {
        Task<String> task=new Task();
        task.setData("Hello!");
        String string=  task.getData();
        System.out.println(string);
    }
}
