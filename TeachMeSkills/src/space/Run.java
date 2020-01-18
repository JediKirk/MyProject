package space;

public class Run {
    public static void main(String[] args) {

        IStart istart1 = new Shuttle();
        IStart istart2 = new SpaceX();

        Spaceport spaceport = new Spaceport();
        spaceport.run(istart1);
        spaceport.run(istart2);
    }
}
