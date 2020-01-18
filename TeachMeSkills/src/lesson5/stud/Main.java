package lesson5.stud;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Tanya", "Duki", 21);
        Student st2 = new Student("Paul", "Lisovski", 24);
        int[] workDone = st1.getHomeWorkDone();
        for (int i = 0; i < workDone.length; i++) {
            System.out.print(workDone[i]);
        }
        st1.doHomeWork(1);
        st1.doHomeWork(2);
        st2.doHomeWork(2);
        Group gr1 = new Group("java", 1);
        gr1.addStudent(st1);
        gr1.addStudent(st2);

        Student[] studentsDone = gr1.checkHomeWorks(2);
        for (int i = 0; i < studentsDone.length; i++) {
            System.out.println(studentsDone[i].getFullName());
        }

        Coach coach1 = new Coach("Jenia", "Parmon", 60, 15, gr1);

        Student[] coachStudentsCheckHomeworkDone = coach1.checkHomeWork(2);
        for (int i = 0; i < coachStudentsCheckHomeworkDone.length; i++) {
            System.out.println(coachStudentsCheckHomeworkDone[i].getFullName());
        }
        coach1.greet();
    }
}
