package classes;
import java.util.Scanner;

class Maths {
	int m1, m2,res;
	Scanner sc = new Scanner(System.in);
	
	void get() {
		System.out.println("Enter marks ");
		m1 = sc.nextInt();
		m2 =sc.nextInt();
		res = m1 + m2;
	}
	void show() {
		System.out.println("\n marks of practical = "+m1);
		System.out.println("marks of theory = "+m2);
		System.out.println("ressult = "+res);
	}
}
public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths M1 = new Maths();
			M1.get();
			M1.show();
		Maths M2 = new Maths();
			M2.get();
			M2.show();
	}

}
