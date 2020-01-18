package Lesson4;

public class Student {
	int studid;
	String name;
	String sname;
	int year;
	double avgM;
	double avgE;
	double avgF;
	
}
	class StudentTest {
		double avgBal(Student st) {
			double SredOcenka=(st.avgM+ st.avgE+st.avgF)/3;
			System.out.println("Sredn99 Arifmeticheska9 Ocenka Studenta "+ st.name + st.sname + ": " + SredOcenka);
			return SredOcenka;
		}
	public static void main(String[] args) {
		Student st1= new Student();
		st1.studid=3547;
		st1.name="Alex";
		st1.sname="Duki";
		st1.year=2019;
		st1.avgM=10;
		st1.avgE=2;
		st1.avgF=6;
		
		
		Student st2= new Student();
		st2.studid=9913;
		st2.name="Olga";
		st2.sname="Buki";
		st2.year=2019;
		st2.avgM=7;
		st2.avgE=2;
		st2.avgF=4;
		
		Student st3= new Student();
		st3.studid=6242;
		st3.name="Michell";
		st3.sname="Tuki";
		st3.year=2019;
		st3.avgM=3;
		st3.avgE=2;
		st3.avgF=3;
		
		StudentTest sTest=new StudentTest();
		sTest.avgBal(st1);
		sTest.avgBal(st2);	
		sTest.avgBal(st3);
	}
	}
	

