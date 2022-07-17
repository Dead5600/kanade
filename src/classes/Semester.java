package classes;
import java.util.Scanner;

class Test {
	int m1,m2,m3;
	Scanner sc = new Scanner(System.in);
	
	void get() {
		System.out.println("\n Enter the marks ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
	}
	void show() {
		System.out.println("marks of m1 = "+m1);
		System.out.println("marks of m2 = "+m2);
		System.out.println("marks of m3 = "+m3);
	}
}
public class Semester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test T1 = new Test();
			T1.get();
			T1.show();
		Test T2 = new Test();
			T2.get();
			T2.show();
	}

}
