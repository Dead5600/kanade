package classes;
import java.util.Scanner;

class Patient{
	int id;
	String name;
	String Dr;
	String rel;
	Scanner sc = new Scanner(System.in);
	
	void in() {
		System.out.println("\n Enter the Patient id, name, Dr. name, relative");
		id = sc.nextInt();
		name = sc.next();
		Dr = sc.next();
		rel = sc.next();
	}
	void out() {
		System.out.println("Patient id is = "+id);
		System.out.println("name of the patient = "+name);
		System.out.println("Doctor name is = "+Dr);
		System.out.println("Relative is = "+rel);
	}
}
public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Patient p1 = new Patient();
		 p1.in();
		 p1.out();
		 
		 Patient p2 = new Patient();
		 p2.in();
		 p2.out();
		 
	}

}
