package lesson5.stud;

public class Group {
    private int id;
    String programmingLanguage;
    static Group[] groups = new Group[5];
    Student[] students = new Student[5];

    Group(String programmingLanguage, int id) {
        this.programmingLanguage = programmingLanguage;
        this.id = id;
        for (int i = 0; i < 1; i++) {
            if (groups[i] == null) {
                groups[i] = this;
                break;
            }
        }
    }

    String groupInformation() {
        return programmingLanguage + " " + id;
    }

    void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    void printGroupsInformation() {
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != null) {
                System.out.println(groups[i].groupInformation());
            }
        }
    }

    Student[] checkHomeWorks(int homeWorkToCheck) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                for (int j = 0; j < students[i].getHomeWorkDone().length; j++)
                    if (students[i].getHomeWorkDone()[j] == homeWorkToCheck) {
                        count++;
                    }
            }
        }
        Student[] checkHomeWorkDone = new Student[count];
        count = 0;
        if (checkHomeWorkDone[count] == null) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    for (int j = 0; j < students[i].getHomeWorkDone().length; j++)
                        if (students[i].getHomeWorkDone()[j] == homeWorkToCheck) {
                            checkHomeWorkDone[count] = students[i];
                            count++;
                        }
                }
            }
        }
        return checkHomeWorkDone;
    }
}

