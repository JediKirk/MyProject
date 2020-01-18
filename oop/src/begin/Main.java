package begin;

public class Main {
    public static void main(String[] args) {
        Person paul = new Person(180,"Paul");
        System.out.println("Name:"+paul.name+" height:"+paul.height);
        paul.say("Tanya");
        Person tanya=new Person();
        System.out.println(tanya.height);
        Person dima=new Person("Dima");
        System.out.println(dima.name+"\n");

        Student freshman1=new Student(160,"Victor",2);
        freshman1.tell();
        Student freshman2=new Student(260,"Gleb",4);
        freshman2.tell();
    }
}
