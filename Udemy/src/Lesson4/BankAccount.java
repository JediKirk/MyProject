package Lesson4;
public class BankAccount {

	int id;
	String name;
	double balance;
	
	double popolnenieScheta(double pribavka) {
		System.out.println("Id "+id+" Imya "+name+ " Balance do pribavki "+ balance);
		balance+=pribavka;
		System.out.println("Balance posle pribavki "+ balance);
		return balance;}
	double snyatieSoScheta(double minus) {
		System.out.println("Balance do minysa "+ balance);
		balance-=minus;
		System.out.println("Balance posle minysa "+ balance);
		return balance;	
		}
	}

class BankAccountTest{
public static void main(String[] args) {
	BankAccount MyAccount= new BankAccount();
	MyAccount.id=1;
	MyAccount.name="Paul";
	MyAccount.balance=1000.99;
	MyAccount.popolnenieScheta(35.5);
	MyAccount.snyatieSoScheta(11.5);
	
}
}	


