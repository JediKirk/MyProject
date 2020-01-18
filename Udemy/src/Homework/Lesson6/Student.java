package Homework.Lesson6;

public class Student {
	Student(int studid1, String name1, String sname1,int year1,double avgM1,double avgE1,double avgF1){
		studid=studid1;
		name=name1;
		sname=sname1;
		year=year1;
		avgM=avgM1;
		avgE=avgE1;
		avgF=avgF1;
	}
	Student(int studid2,String name2,String sname2,int year2){
		this(studid2,name2,sname2,year2,0.0,0.0,0.0);
	}
	Student(){
		
	}
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
		Student st1= new Student(1,"Tanya","Duki",5,6.0,10.0,9);
		
		Student st2= new Student(2,"Olga","Byki",5);
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
	