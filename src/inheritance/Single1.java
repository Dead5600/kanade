package inheritance;
import java.util.Scanner;

class Std {
	int r;
	String nm;
	Scanner sc = new Scanner(System.in);
	
	void accept() {
	System.out.println("\n Enter roll num and name of the student");
	r = sc.nextInt();
	nm = sc.next();
	}
	void display() {
		System.out.println("Roll num is = "+r);
		System.out.println("Name of the Student is ="+nm);
	}
}

class Test extends Std{
	int m1,m2,m3;
	Scanner sc = new Scanner(System.in);
	
	void get() {
		System.out.println("\n Enter the marks of the three subject");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
	}
	void put() {
		System.out.println("Marks of the subject 1 = "+m1);
		System.out.println("Marks of the subject 2 = "+m2);
		System.out.println("Marks of the subject 3 = "+m3);
	}
}
public class Single1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test T1 = new Test();
			T1.accept();
			T1.display();
			T1.get();
			T1.put();
	}

}
