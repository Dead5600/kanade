package inheritance;
import java.util.Scanner;

class Employee {
	int id;
	String nm;
	Scanner sc = new Scanner(System.in);
	
	void accept() {
		System.out.println("\n Enter id and name of the employee");
		id = sc.nextInt();
		nm = sc.next();
	}
	void display() {
		System.out.println("Id of the employee = "+id);
		System.out.println("name of the employee = "+nm);
	}
}
class Salary extends Employee {
	int amt,attend;
	Scanner sc = new Scanner(System.in);
	
	void get() {
		System.out.println("\n Enter amount and attendance");
		amt = sc.nextInt();
		attend = sc.nextInt();
	}
	void show() {
		System.out.println("salary amount is = "+amt);
		System.out.println("attendance is = "+attend);
	}
}
public class Single2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s1 = new Salary();
			s1.accept();
			s1.display();
			s1.get();
			s1.show();
	}

}
